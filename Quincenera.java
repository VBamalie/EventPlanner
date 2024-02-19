public class Quincenera extends BirthdayParty{
    private int _numOfDamas;
    private int _numOfToasts;
    private String _danceMusic;

    //SETTERS
    public void setNumOfDamas(int numOfDamas) {
        this._numOfDamas = numOfDamas;
    }
    public void setNumOfToasts(int numOfToasts) {
        this._numOfToasts = numOfToasts;
    }
    public void setDanceMusic(String fanceMusic) {
        this._danceMusic = fanceMusic;
    }

    //GETTERS
    public int getNumOfDamas() {
        return _numOfDamas;
    }
    public int getNumOfToasts() {
        return _numOfToasts;
    }
    public String getDanceMusic() {
        return _danceMusic;
    }

    //TODO create tostring

    public String toString() {
        String cake = _cake? "there will be cake, ": "there will not be cake, ";
        String candles = _candles? "there will be candles, ": "there will not be candles, ";
        String decorations = _decorations? "and there will be decorations.": "and there will not be decorations.";
        return "This Event is a Quincenera. The birthday person will be turning " + _age + ". It is on " + _date + " from " + _startTime + " to " + _endTime + " at the " + _locationName + " located at " + _locationAddress + ". There will be " + _numOfGuests + " people coming. " + cake + candles + decorations + "There will be " + _numOfDamas + " damas and " + _numOfToasts + " times where we toast. There will be " + _danceMusic + " music. The party costs " + _price + ". For more information contact " + _pointOfContact;
    }
}
