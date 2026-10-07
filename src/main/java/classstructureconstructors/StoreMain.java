package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store videoCardStore = new Store("Nvidia 8800GTS");
        videoCardStore.store(10);
        videoCardStore.dispatch(5);

        Store hddStore = new Store("WD 12300 500 GB");
        hddStore.store(15);
        hddStore.dispatch(14);

        System.out.println("Store status");
        System.out.println("Store name:" + videoCardStore.getProduct() + " Store quantity:" + videoCardStore.getStock());
        System.out.println("Store name:" + hddStore.getProduct() + " Store quantity:" + hddStore.getStock());



    }
}
