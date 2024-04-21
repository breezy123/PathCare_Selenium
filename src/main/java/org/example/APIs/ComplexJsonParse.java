package org.example.APIs;

import io.restassured.path.json.JsonPath;
import org.example.APIs.files.PayLoad;

public class ComplexJsonParse {

    public static void main(String[]args){

        JsonPath js = new JsonPath(PayLoad.CoursePrice());
        //Print No of courses returned by API

        int count =js.getInt("courses.size()");
        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        String countTitles = js.getString("courses[1].title");
        System.out.print("Total courses:\t"+count+"\n"+"Total amount:\t"+purchaseAmount
        +"\nTotal Titles:\t"+countTitles+"\n");

        for(int x=0; x<count; x++){
           System.out.println(js.get("courses["+x+"].title").toString()+"\n"+js.get("courses["+x+"].price").toString());
        }

        System.out.println("Print no of copies sold by RPA Course");

        for(int i=0; i<count; i++){
            if(js.get("courses["+i+"].title").toString().equalsIgnoreCase("RPA")){
                int copies = js.get("courses["+i+"].copies");
                System.out.println(copies);
                break;
            }
        }
    }
}
