class Logger {

    private HashMap<String, Integer> hm;
    public Logger() {
        hm = new HashMap<String, Integer>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!hm.containsKey(message)) {
            hm.put(message, timestamp);
            return true;
        }
        int timeDuration = timestamp - hm.get(message);
        if(timeDuration >= 10) {
            hm.put(message, timestamp);
            return true;
        } else
            return false;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */