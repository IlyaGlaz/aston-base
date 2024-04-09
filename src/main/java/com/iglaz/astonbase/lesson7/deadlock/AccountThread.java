package com.iglaz.astonbase.lesson7.deadlock;

public class AccountThread extends Thread {

    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    /**
     * 1 ------- account1 -> account2
     * <p>
     * 2 ------- account2 -> account1
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            lockAccounts();
            synchronized (accountFrom) {
                synchronized (accountTo) {
                    if (accountFrom.takeOff(10)) {
                        accountTo.add(10);
                    }
                }
            }
        }
    }

//    private void lockAccounts() {
//        while (true) {
//            boolean fromLockResult = accountFrom.getLock().tryLock();
//            boolean toLockResult = accountTo.getLock().tryLock();
//            if (fromLockResult && toLockResult) {
//                break;
//            }
//            if (fromLockResult) {
//                accountFrom.getLock().unlock();
//            }
//            if (toLockResult) {
//                accountTo.getLock().unlock();
//            }
//        }
//    }
}
