//package Basic;
//
//import java.time.LocalDate;
//
//public class CarMethod {
//    public double getSalePrice(String makeAndModel, int YearManuafactured, double milesDriven, int AirBagCounts, boolean hasAbs,
//                               boolean hasEbd, boolean hasRearViewCamera, boolean hasSunRoof, boolean hasAutoAC,
//                               boolean hasAccidentHistory){
//        double salePrice = getSalePrice(makeAndModel, YearManuafactured);
//        int currentYear = LocalDate.now().getYear();
//        int ageOfCar = currentYear - YearManuafactured + 1;
//        System.out.println("ageOfCar: "+ageOfCar);
//
//        if (ageOfCar <=10){
//            salePrice = salePrice - (ageOfCar * salePrice * 0.05);
//        }
//        else {
//            return salePrice * 0.1;
//        }
//        System.out.println("SalePrice after depreciation: "+salePrice);
//
//        if (!(AirBagCounts >= 2 && hasAbs && hasEbd)){
//            salePrice -= 1000;
//        }
//        System.out.println("SalePrice after accounting for security feature: "+ salePrice);
//
//        if (hasAccidentHistory){
//            salePrice -= 500;
//        }
//        System.out.println("salePrice after accounting for past accidents: "+salePrice);
//
//        double ExpectedMilesDriven = ageOfCar * 10000.0;
//        double additionalMiles = milesDriven - ExpectedMilesDriven;
//
//        if (additionalMiles > 1000 && additionalMiles <=10000){
//            salePrice -=500;
//        }
//
//        if (additionalMiles > 10000 && additionalMiles <= 30000){
//            salePrice -= 1000;
//        }
//
//        if (additionalMiles > 30000){
//            salePrice -= 1500;
//        }
//        System.out.println("salePrice after accounting for mileDriven: "+salePrice);
//        return salePrice;
//    }
//
//    private double getPrice(String makeAndModel, int yearManufactured){
//        if (makeAndModel.equalsIgnoreCase("ford ecosport")){
//            return 20000.0;
//        }
//        public static void main(String[] args){
//            CarMethod cm = new CarMethod();
//            double salePrice = cm.getSalePrice("ford ecosport",2018,60000.0,2,
//                    true,false,true,false,false,true);
//
//        }
//    }
//}
