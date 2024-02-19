public class Event {
    protected String _date;
    protected int _startTime;
    protected int _endTime;
    protected String _locationName;
    protected String _locationAddress;
    protected String _eventName;
    protected int _numOfGuests;
    protected String _pointOfContact;
    protected double _price;

    //SETTERS
    public void setDate(String date){
        this._date = date;
    }//end setDate

    public void setStartTime(int time){
        this._startTime = time;
    }//end setStartTime

    public void setEndTime(int time){
        this._endTime = time;
    }//end setEndTime
    
    public void setLocationName(String name){
        this._locationName = name;
    }//end setLocationName

    public void setLocationAddress(String address){
        this._locationAddress = address;
    }// end setLocationAddress

    public void setEventName(String name){
        this._eventName = name;
    }// end setEventName

    public void setNumOfGuests(int num){
        this._numOfGuests = num;
    }//end setNumOfWuests

    public void setPointOfContact(String name){
        this._pointOfContact = name;
    }//end setPointOfContact

    public void setPrice(double price){
        this._price = price;
    }//end setPrice

    //GETTERS
    public String getDate(){
        return _date;
    }//end getDate

    public int getStartTime(){
        return _startTime;
    }//end getStartTime

    public int getEndTime(){
        return _endTime;
    }//end getEndTime

    public String getLocationName(){
        return _locationName;
    } //end getEndTime

    public String getLocationAddress(){
        return _locationAddress;
    }// end getLocationName

    public String getEventName(){
        return _eventName;
    }// edn getEvenName

    public int getNumOfGuests(){
        return _numOfGuests;
    }// end GetNumOfGuests

    public String getPointOfContact(){
        return _pointOfContact;
    }// end getPointOfContact

    public double getPrice(){
        return _price;
    }// end getPrice

    public String toString(){
        return "This Event is called a " + _eventName + ". It is on " + _date + " from " + _startTime + " to " + _endTime + " at the " + _locationName + " located at " + _locationAddress + ". There will be " + _numOfGuests + " people coming. The party costs " + _price + ". For more information contact " + _pointOfContact;
    }
}
