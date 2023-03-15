public class MyStringBuffer {
    private char[] str;
    //Constructor
    MyStringBuffer(String word){
        str= new char[word.length()];
        for(int i=0;i<word.length();i++){
            str[i]=word.charAt(i);
        }
    }
    //print method
    public void print(){
        for(int i=0;i<str.length;i++){
            System.out.print(this.str[i]);
        }
    }
    public int indexOf(char c){
        for(int i=0;i<str.length;i++){
            if(str[i]==c){
                return i;
            }
        }
        return -1;
    }
    public int length(){
        return str.length;
    }
    public void erase(int pos, int length){
        char[] str2;
        //if the substring is at the end of array
        if (pos + length >= str.length) {
            str2 = new char[pos];
            for (int i = 0; i <pos; i++) {
                str2[i] = str[i];
            }
            //if substring is at the middle of a string
        } else {
            
            str2 = new char[str.length - length];
            int j = 0;
            //first part of word
            for (int i = 0; i < pos; i++) {
                str2[j] = str[i];
                j++;
            }
            //second part (after the gap)
            for (int i = pos + length; i < str.length; i++) {
                str2[j] = str[i];
                j++;
            }
        }
    str = str2;
    }

public void insert(int pos, String str) {
    char[] str2 = new char[this.str.length + str.length()];
    int j = 0;
    for (int i = 0; i < pos; i++) {
        str2[j] = this.str[i];
        j++;
    }
    for (int i = 0; i < str.length(); i++) {
        str2[j] = str.charAt(i);
        j++;
    }
    for (int i = pos; i < this.str.length; i++) {
        str2[j] = this.str[i];
        j++;
    }
        
    this.str = str2;
    }
}
