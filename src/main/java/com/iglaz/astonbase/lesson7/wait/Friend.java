package com.iglaz.astonbase.lesson7.wait;

/**
 * простой класс где используетя wait notify на примере игры в прятки
 * тот кто ищет seeker не может искать, пока тот кто прячется hider не спрячется
 */
public class Friend {
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @param seeker используется для освобождения монитора
     */
    public void hide(Friend seeker) {
        System.out.println("Друг по имени " + name + " ищет место чтобы спрятаться");
        try {
            Thread.sleep(3000); // используется чтобы метод seek не срабатывал раньше чем метод hide
            System.out.println("Друг по имени " + name + " спрятался");
            //  synchronized (this) приведет к вечному ожиданию  livelock т.к тот кто спрятался он никого не ожидает
            //  а ожидает лишь тот кто ищет
            synchronized (seeker) { // пока мы ждали 3 секунды к этому моменту был уже захвачен монитор у объекта seeker
                seeker.notify(); // так как был захвачен монитор объекта который ищет его нужно разбудить
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param hider используется чисто для отображения имени
     */
    public void seek(Friend hider)  {
        synchronized (this) {
            System.out.println(name + " ждет пока другие спрячутся");
            try {
                this.wait(); // тот кто ищет он ждет пока другие спрячутся
                // захватывается монитор объекта который ищет
                System.out.println(name + " начинает искать");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println(name + " нашел " + hider.getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Friend ildus = new Friend("Ildus");
        Friend timur = new Friend("Timur");
        Thread seeker = new Thread(() -> {ildus.seek(timur);});
        Thread hider = new Thread(() -> {timur.hide(ildus);});

        hider.start();
        seeker.start();

        // чтобы главный поток не завершил работу и был доступен консоль
        hider.join();
        seeker.join();
    }
}
