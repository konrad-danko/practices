package exercices.avro;

import com.google.gson.Gson;
import exercices.avro.customer.Customer;
import exercices.avro.customer.address.Address;
import exercices.avro.customer.enums.ResidencyType;
import exercices.avro.customer.enums.Status;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AvroMain {

  private static String id = "sdfg-52df-jki9-fggp-0052";
  private static String name = "Marek Markowski";
  private static long pesel = 10080066898L;
  private static LocalDate birthday = LocalDate.of(2000, 05, 15);
  private static boolean isQualified = true;
  private static List<CharSequence> phoneNumbers = Arrays.asList("+48 22 123 4567", "+48 606 505 404", "+48 987 654 321");
  private static String hobby = "Sport";

  private static String street = "Kowalska";
  private static int houseNumber = 20;
  private static String city = "Legionowo";
  private static String  postCode = "05-120";


  public static void main(String[] args) {
    System.out.println(new Gson().toJson(createCustomer()));
    System.out.println(createCustomer());
  }

  private static Customer createCustomer(){
    return Customer.newBuilder()
        .setId(id)
        .setName(name)
        .setPesel(pesel)
        .setBirthday(birthday)
        .setIsQualified(isQualified)
        .setPhoneNumbers(phoneNumbers)
        .setHobby(hobby)
        .setSomeMap(createMap())
        .setStatus(Status.GOLD)
        .setResidencyType(ResidencyType.PL)
        .setAddresses(createAddresses())
        .build();
  }

  private static List<Address> createAddresses(){
    Address address = Address.newBuilder()
        .setStreet(street)
        .setHouseNumber(houseNumber)
        .setCity(city)
        .setPostCode(postCode)
        .build();
    return Arrays.asList(address, address, address);
  }

  private static Map<CharSequence, CharSequence> createMap(){
    Map<CharSequence, CharSequence> resultMap = new HashMap<>();
    resultMap.put("key1", "value1");
    resultMap.put("key2", "value2");
    resultMap.put("key3", "value3");
    resultMap.put("key4", "value4");
    return resultMap;
  }
}
