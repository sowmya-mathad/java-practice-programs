package com.sow.date;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
class DateTimeFormatDemo
{
   public static void main(String[] args)
   {
      String input = "07:05:12PM";
      //Format of the date defined in the input String
      DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
      //Desired format: 24 hour format: Change the pattern as per the need
      DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
      Date date = null;
      String output = null;
      try{
         //Converting the input String to Date
    	 date= df.parse(input);
         //Changing the format of date and storing it in String
    	 output = outputformat.format(date);
         //Displaying the date
    	 System.out.println(output);
      }catch(ParseException pe){
         pe.printStackTrace();
       }
   }
}