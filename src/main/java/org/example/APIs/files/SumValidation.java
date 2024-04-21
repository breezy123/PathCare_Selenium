package org.example.APIs.files;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumValidation {

    @Test
    public void sumOfCourses(){

        JsonPath json = new JsonPath(PayLoad.CoursePrice());
        int count =json.getInt("courses.size()");
        int amount=0;
        int sum=0;

        for(int i=0; i<count; i++){
          int price =  json.getInt("courses["+i+"].price");
          int copies = json.getInt("courses["+i+"].copies");

           amount = price*copies;
           System.out.println("Total amount:"+amount);

           sum = sum+amount;

        }

        System.out.println("Purchase amount: R"+sum);

        int purchaseAmount =json.getInt("dashboard.purchaseAmount");

        Assert.assertEquals(sum,purchaseAmount);

    }
}
