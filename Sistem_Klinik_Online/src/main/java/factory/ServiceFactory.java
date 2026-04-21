package factory;

import service.*;

public class ServiceFactory {

    public static Service create(int pilihan) {
        switch (pilihan) {
            case 1:
                return new KonsultasiService();
            case 2:
                return new BeliObatService();
            case 3:
                return new CheckupService();
            case 4:
                return new DokterService();
            default:
                return null;
        }
    }
}