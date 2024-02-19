public class BirthdayParty extends Event{
    protected int _age;
    protected boolean _cake;
    protected boolean _candles;
    protected boolean _decorations;
    
    //GETTERS
    public int getAge() {
        return _age;
    }
    public boolean isCake() {
        return _cake;
    }
    public boolean isCandles() {
        return _candles;
    }
    public boolean isDecorations() {
        return _decorations;
    }

    //SETTERS
    public void setAge(int age) {
        this._age = age;
    }
    public void setCake(boolean cake) {
        this._cake = cake;
    }
    public void setCandles(boolean candles) {
        this._candles = candles;
    }
    public void setDecorations(boolean decorations) {
        this._decorations = decorations;
    }

    public String toString() {
        String cake = _cake? "there will be cake, ": "there will not be cake, ";
        String candles = _candles? "there will be candles, ": "there will not be candles, ";
        String decorations = _decorations? "and there will be decorations.": "and there will not be decorations.";
        return "This Event is a birthday party. The birthday person will be turning " + _age + ". It is on " + _date + " from " + _startTime + " to " + _endTime + " at the " + _locationName + " located at " + _locationAddress + ". There will be " + _numOfGuests + " people coming. " + cake + candles + decorations + " The party costs " + _price + ". For more information contact " + _pointOfContact;
    }
}
