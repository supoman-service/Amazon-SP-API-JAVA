package com.amazon.spapi.utils;

//参考：https://www.codenong.com/14534767/
public class StringBuilderPlus {
    private StringBuilder sb;

    public StringBuilderPlus(){
        sb = new StringBuilder();
    }

    public void append(String str)
    {
        sb.append(str != null ? str :"");
    }

    public void appendLine(String str)
    {
        sb.append(str != null ? str :"").append(System.getProperty("line.separator"));
    }

    public String toString()
    {
        return sb.toString();
    }
}
