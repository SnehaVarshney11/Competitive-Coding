class DesignUndergroundSystem{
    int t;
    String st;
    public passengerData(int t , String st){
        this.t =  t;
        this.st =  st;
    }

}

class avgObject{
    double total;
    int c;
    
    public avgObject(int c, double time){
        this.c =  c;
        this.total  =  time;
    }
    
    void updateAvg(double newavg){        
        this.total +=  newavg;
        this.c+=1;        
    }    
}

class UndergroundSystem {

    
    final HashMap<Integer,passengerData> train ;
    final Map<String,HashMap<String,avgObject >> record ;
    
    public UndergroundSystem() {
        train =  new HashMap<>();
        record =  new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
      
        passengerData newcust =  new passengerData(t,stationName);
        train.put(id,newcust);
        
    }
    
    public void checkOut(int id, String stationName, int t) {
        passengerData cust =  train.get(id);
        String startStation =  cust.st;
        int duration =  t - cust.t;
        
        record.putIfAbsent(startStation,new HashMap<>());        
        HashMap<String,avgObject > endstation = record.get(startStation);
        
        avgObject e = endstation.get(stationName);
        
        if(e!=null){                        
            e.updateAvg(duration);
        }
        else{
            avgObject entry =  new avgObject(1,duration);
            endstation.put(stationName,entry);            
        }
        train.remove(id);             
    }
    
    public double getAverageTime(String startStation, String endStation) {
        HashMap<String,avgObject > station =  record.get(startStation);
        avgObject entry =  station.get(endStation);       
        return (double)entry.total/entry.c;
       
    } 
}