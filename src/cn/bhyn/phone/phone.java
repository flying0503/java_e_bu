package cn.bhyn.phone;

public class phone {
    float price;
    String name;
    private int pass_word;  //私有保护无法直接访问

    public int getPass_word()
    {
        return pass_word;
    }

    public void setPass_word(int new_password)
    {
        pass_word = new_password;
    }
}
