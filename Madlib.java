public class MadLibs {
  /*
This program generates a mad libbed story.
Author: Yonael
Date: 1/16/2018
  */
  	public static void main(String[] args){
      
  /*
  Enter whatever you want on the Strings and ints to create a story. and don't worry about how how crazy it
  */      
      String name1= "Yonael";
      String adjective1= "Big";
      String adjective2= "Handsome";
      String adjective3= "Beautiful";
      String verb1= "drink";
      String noun1= "Teacher";
      String noun2= "Man";
      String noun3= "Lion";
      String noun4= "Mary";
      String noun5= "Banana";
      String noun6= "Music";
      String name2= "Dre";
      int number= 7;
      String place1= "Ethiopia";  

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+"texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);



    }       
}
