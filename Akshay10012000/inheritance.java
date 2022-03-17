public class Mobile1 {
String name;
int cost;
String SoftwareVersion;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getCost() {
return cost;
}
public void setCost(int cost) {
this.cost = cost;
}
public String getSoftwareVersion() {
return SoftwareVersion;
}
public void setSoftwareVersion(String softwareVersion) {
SoftwareVersion = softwareVersion;
}
}
public class Apple extends Mobile1 {
String brand;
int battery;
public Apple(String brand,int battery){
this.brand = brand;
this.battery = battery;
}
public String getBrand() {
return brand;
}
public void setBrand(String brand) {
this.brand = brand;
}
public int getBattery() {
return battery;
}
public void setBattery(int battery) {
this.battery = battery;
}
}
public class Samsung extends Mobile1 {
String brand;
int battery;
public Samsung(String brand,int battery){
this.brand = brand;
this.battery = battery;
}
public String getBrand() {
return brand;
}
public void setBrand(String brand) {
this.brand = brand;
}
public int getBattery() {
return battery;
}
public void setBattery(int battery) {
this.battery = battery;
}
}
public class InheritanceMobile {
public static void main(String[] args) {
Mobile1 m = new Mobile1();
Apple a = new Apple("Apple", 4000);
Samsung s = new Samsung("Samsung",5000);
a.setName("iphone 12");
a.setCost(70000);
a.setSoftwareVersion("IOS");
s.setBattery(3500);
s.setName("Galaxy Pro");
s.setCost(45000);
s.setSoftwareVersion("Android");
System.out.println(a.getBrand());
System.out.println(a.getName());
System.out.println(a.getCost());
System.out.println(a.getSoftwareVersion());
System.out.println(a.getBattery());
System.out.println(s.getBrand());
System.out.println(s.getName());
System.out.println(s.getCost());
System.out.println(s.getSoftwareVersion());
System.out.println(s.getBattery());
}
}