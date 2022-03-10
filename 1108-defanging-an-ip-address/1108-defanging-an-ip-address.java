class Solution {
    public String defangIPaddr(String address) {
        String defangAddress = address.replace(".", "[.]");
        return defangAddress;
    }
}