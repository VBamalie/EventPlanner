import java.util.Scanner;
import java.util.ArrayList; 

public class EventPlanner {
    public static void eventPrompt(Event party){
        Scanner input = new Scanner(System.in);
        System.out.println("What date is the party?");
        party.setDate(input.nextLine());
        System.out.println("What time does the party start?");
        party.setStartTime(Integer.parseInt(input.nextLine()));
        System.out.println("What time does the party end?");
        party.setEndTime(Integer.parseInt(input.nextLine()));
        System.out.println("What is the name of the location this party is at?");
        party.setLocationName(input.nextLine());
        System.out.println("What is the address of the location?");
        party.setLocationAddress(input.nextLine());
        if(party instanceof BirthdayParty || party instanceof Quincenera){
            party.setEventName("Birthday Party");
        } else{
            System.out.println("What is type of party is this?");
            party.setEventName(input.nextLine());
        }
        System.out.println("How many guests are coming?");
        party.setNumOfGuests(Integer.parseInt(input.nextLine()));
        System.out.println("Who should guests contact to get more information?");
        party.setPointOfContact(input.nextLine());
        System.out.println("How much is this party going to cost?");
        party.setPrice(Double.parseDouble(input.nextLine()));
    }//end eventPrompt

    public static void birthdayPrompt(BirthdayParty party){
        Scanner input = new Scanner(System.in);
        if(party instanceof Quincenera){
            party.setAge(15);
        }else {
            System.out.println("What age is the birthday person turning?");
            party.setAge(Integer.parseInt(input.nextLine()));
    }
        System.out.println("Type y if there will be cake");
        if(input.nextLine().equalsIgnoreCase("y")){
            party.setCake(true);
        } else party.setCake(false);
        System.out.println("Type y if there will be candles");
        if(input.nextLine().equalsIgnoreCase("y")){
            party.setCandles(true);
        }else party.setCandles(false);
        System.out.println("Type y if there will be decorations");
        if(input.nextLine().equalsIgnoreCase("y")){
            party.setDecorations(true);
        }else party.setDecorations(false);
    } //end birthdayPrompt  

    public static void QuinceneraPrompt(Quincenera party){
         Scanner input = new Scanner(System.in);
       
        System.out.println("How many damas will there be?");
        party.setNumOfDamas(Integer.parseInt(input.nextLine()));
        System.out.println("How many toasts are there going to be?");
        party.setNumOfToasts(Integer.parseInt(input.nextLine()));
        System.out.println("What type of music will there be?");
        party.setDanceMusic(input.nextLine());
    }// end QuinceneraPrompt
 public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Event> events = new ArrayList<>();
       System.out.println("How many parties are you having?");
       int listSize = Integer.parseInt(input.nextLine());
       for(int i = 0; i < listSize; i++){
        System.out.println("Type 1 if this is a general event, type 2 if this is a birthday party, type 3 if this is a Quincenera.");
        int partyType = Integer.parseInt(input.nextLine());
        // switch(partyType){
        //     case 1: Event party = new Event();
        //     events.add(party);
        //     break;
        //     case 2: BirthdayParty birthday = new BirthdayParty();
        //     events.add(birthday);
        //     break;
        //     case 3: Quincenera quincenera = new Quincenera();
        //     events.add(quincenera);
        //     break;
        //     default: System.out.println("invalid number, try again!");
        //     i--;
        //     break;
        // }
        // Event party = events.get(i);
        // System.out.println("What date is the party?");
        // party.setDate(input.nextLine());
        // System.out.println("What time does the party start?");
        // party.setStartTime(Integer.parseInt(input.nextLine()));
        // System.out.println("What time does the party end?");
        // party.setEndTime(Integer.parseInt(input.nextLine()));
        // System.out.println("What is the name of the location this party is at?");
        // party.setLocationName(input.nextLine());
        // System.out.println("What is the address of the location?");
        // party.setLocationAddress(input.nextLine());
        // System.out.println("What is type of party is this?");
        // party.setEventName(input.nextLine());
        // System.out.println("How many guests are coming?");
        // party.setNumOfGuests(Integer.parseInt(input.nextLine()));
        // System.out.println("Who should guests contact to get more information?");
        // party.setPointOfContact(input.nextLine());
        // System.out.println("How much is this party going to cost?");
        // party.setPrice(Double.parseDouble(input.nextLine()));

        // if(party instanceof BirthdayParty || party instanceof Quincenera){
            
        // }
        
        switch (partyType) {
            case 1:
                Event party = new Event();
                events.add(party);
                eventPrompt(party);
                break;
            case 2: 
                BirthdayParty bdParty = new BirthdayParty();
                events.add(bdParty);
                eventPrompt(bdParty);
                birthdayPrompt(bdParty);
                break;
            case 3:
                Quincenera bdqParty = new Quincenera();
                events.add(bdqParty);
                eventPrompt(bdqParty);
                birthdayPrompt(bdqParty);
                QuinceneraPrompt(bdqParty);
                break;
            default:
                System.out.println("That's an invalid input, please type 1, 2, or 3");
                i--;
                break;
        }//end switchcase
       }//endfor
       for (Event event : events) {
        System.out.println(event.toString()+ "\n");
    }
    }
}
