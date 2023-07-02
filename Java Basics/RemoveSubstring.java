class RemoveSubstring {
    public String removeOccurrences(String s, String part) {
        StringBuilder ans = new StringBuilder();
        int plen = part.length();
        for ( int i = 0; i< s.length() ; i++ ){
            ans.append(s.charAt(i));
            if ( ans.length() >= plen){
                if ( ans.substring( ans.length() - plen).equals(part) ){
                    ans.setLength( ans.length() - plen);
                }
            }
        }
        return ans.toString();
    }
}