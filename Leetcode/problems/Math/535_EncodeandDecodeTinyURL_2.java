public class Codec {
	Map<String,String>map=new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
    		String res=longUrl;
      map.put(longUrl,res);
      return res;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        for(String key:map.keySet()){
        	if(map.get(key).equals(shortUrl)){
        		return key;
        	}
        }
        return "";
    }
}