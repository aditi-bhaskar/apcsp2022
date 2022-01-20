package app.storybuilder;

import java.util.Scanner;

public class storybuilder {
  
  Scanner noun ;
  boolean isDone ;
  String a_word_ ;
  String b_word_ ;
  
  String curr_transition = "" ;
  boolean first_time_thru = true ;

  
  public storybuilder() {
    System.out.println("==========HOW TO PLAY==========") ;
    System.out.println("================================= "
                        + " \nenter 2 nouns [hit 'enter' between the two]" 
                        + " and a sentence will appear!"
                        + " \n keep writing more nouns and the story will grow!"
                        + " \nthe game will magically end when"
                        + " certain conditions are met..."
                        + " \nhave fun!!!") ;

    System.out.print("\n ||||||||||||| \nOnce upon a time... \n") ;
    
    noun = new Scanner(System.in) ;
    isDone = false;
    a_word_ = "" ;
    b_word_ = "" ;
  
  }

  public void buildmeastory() {
    while (!isDone) {
      
      if (!first_time_thru) {
        curr_transition = transitionfinder() ;
        System.out.println(curr_transition + "...") ;
      }

      a_word_ = noun.nextLine() ;
      b_word_ = noun.nextLine() ;

      if(a_word_.equals("") || b_word_.equals("")) {
        System.out.println("please enter 2 nouns") ;
        a_word_ = noun.nextLine() ;
        b_word_ = noun.nextLine() ;
      }
      
      if(first_time_thru) {
        System.out.println(a_word_ + " " + verbfinder() 
                            + " " + b_word_ + " " 
                            + locationfinder() + ".\n") ;
                            first_time_thru = false ;
      } else if (!first_time_thru) {
        System.out.println(curr_transition + " " 
                          + a_word_ + " " + verbfinder() 
                          + " " + b_word_ + " " 
                          + locationfinder() + ".\n") ;
      }
      
      
      if (a_word_.length() >= 5) {
        if (a_word_.substring(3, 4).equals("c") || a_word_.length() == 7 || a_word_.equals("q")) {
          System.out.println("The End!") ;
          isDone = true ;
        }
      }
      
    }
  }
  
  public String verbfinder() {
   
    int random = (int)(Math.random()*100);
    int n = 28 ; //number of verbs
    
    String[] return_verb_ = new String[n];
    //VERBS    only up to  n-1 bc start at 0
    return_verb_[0] = "went to" ;
    return_verb_[1] = "did a" ;
    return_verb_[2] = "ate a tonne of" ;
    return_verb_[3] = "spelled the word" ;
    return_verb_[4] = "cried because of" ;
    return_verb_[5] = "flicked a" ;
    return_verb_[6] = "swam to" ;
    return_verb_[7] = "annoyed" ;
    return_verb_[8] = "was kicked by" ;
    return_verb_[9] = "died because of" ;
    return_verb_[10] = "gave birth to" ;
    return_verb_[11] = "broke a" ;
    return_verb_[12] = "drank with" ;
    return_verb_[13] = "wrote on" ;
    return_verb_[14] = "played with" ;
    return_verb_[15] = "slept on" ;
    return_verb_[16] = "sat on" ;
    return_verb_[17] = "kissed a" ;
    return_verb_[18] = "got married to" ;
    return_verb_[19] = "flew to" ;
    return_verb_[20] = "got a concussion from" ;
    return_verb_[21] = "beesechurgered" ;
    return_verb_[22] = "yelled at" ;
    return_verb_[23] = "was a goody goody to" ;
    return_verb_[24] = "was more LOSER than" ;
    return_verb_[25] = "played the fiddle with" ;
    return_verb_[26] = "sang with" ;
    return_verb_[27] = "yawned into the face of" ;


    //finally, return the "magic" verb
    return return_verb_[(int)(random % n)] ;
  }

  public String locationfinder() {

    int random = (int)(Math.random()*100);
    int n = 29 ; //number of locations
    
    String[] return_location_ = new String[n];

    //LOCATIONS    only up to  n-1 bc start at 0
    return_location_[0] = "at the beach" ;
    return_location_[1] = "at school" ;
    return_location_[2] = "in a coma" ;
    return_location_[3] = "for five minutes" ;
    return_location_[4] = "with an amiable disposition" ;
    return_location_[5] = "in the park" ;
    return_location_[6] = "in an airplane" ;
    return_location_[7] = "with their friends" ;
    return_location_[8] = "before reading a book with a similar theme" ;
    return_location_[9] = "in a pool" ;
    return_location_[10] = "in the Netherlands" ;
    return_location_[11] = "in the kitchen" ;
    return_location_[12] = "2 hours ago" ;
    return_location_[13] = "for 60 extraordinary seconds" ;
    return_location_[14] = "before they were caught by the police" ;
    return_location_[15] = "then bought a jacket" ;
    return_location_[16] = "on a couch" ;
    return_location_[17] = "in the mountains" ;
    return_location_[18] = "near a river" ;
    return_location_[19] = "in the backyard" ;
    return_location_[20] = "on the highway" ;
    return_location_[21] = "in fields of golden hay" ;
    return_location_[22] = "in bed" ;
    return_location_[23] = "on an island" ;
    return_location_[24] = "while watching TV" ;
    return_location_[25] = "in the mall" ;
    return_location_[26] = "atop a tree" ;
    return_location_[27] = "on the stairs" ;
    return_location_[28] = "behind the curtain" ;

    //finally, return the "magic" location
    return return_location_[(int)(random % n)] ;
  }

  public String transitionfinder() {

    int random = (int)(Math.random()*100) ;
    int n = 10 ; //number of transitions
    
    String[] return_transition_ = new String[n] ;

    return_transition_[0] = "then" ;
    return_transition_[1] = "on the other hand" ;
    return_transition_[2] = "therefore" ;
    return_transition_[3] = "and then" ;
    return_transition_[4] = "meanwhile" ;
    return_transition_[5] = "yesterday" ;
    return_transition_[6] = "later" ;
    return_transition_[7] = "so" ;
    return_transition_[8] = "back in the day" ;
    return_transition_[9] = "last week" ;

    //finally, return the "magic" transition phrase
    return return_transition_[(int)(random % n)] ;
  }

}
