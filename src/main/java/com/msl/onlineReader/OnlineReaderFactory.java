package com.msl.onlineReader;

import com.msl.onlineReader.AbstractOnlineReader;
import com.msl.onlineReader.Epubeader;
import com.msl.onlineReader.PdfReader;

/**
 * @author fujiaxing
 * @date 2019/01/23
 */
public class OnlineReaderFactory {
    public AbstractOnlineReader getOnlinReader(String filename){
        AbstractOnlineReader abstractOnlineReader = null;
        String[] strs = filename.split(".");
        switch (strs[strs.length-1].toLowerCase()){
            case ".pdf":
                abstractOnlineReader = new PdfReader();
                break;
            case ".epub":
                abstractOnlineReader = new Epubeader();
                break;
                default:
        }
        return abstractOnlineReader;
    }
}