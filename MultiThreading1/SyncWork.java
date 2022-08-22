class SyncWork{
    public synchronized void wish(String name){
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Moriing "+name+" !");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }


    // Non-Synchronized
    // public void wish(String name){
    //     for (int i = 0; i < 10; i++) {
    //         System.out.println("Good Moriing "+name+" !");
    //         try {
    //             Thread.sleep(1000);
    //         } catch (Exception e) {
    //             //TODO: handle exception
    //         }
    //     }
    // }
}