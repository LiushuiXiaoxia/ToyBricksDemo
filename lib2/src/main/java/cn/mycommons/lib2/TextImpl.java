package cn.mycommons.lib2;

import com.github.snowdream.toybricks.annotation.Implementation;

import cn.mycommons.lib1.IText;

/**
 * TextImpl <br/>
 * Created by xiaqiulei on 2017-05-08.
 */
@Implementation(IText.class)
public class TextImpl implements IText {

    @Override
    public String getText() {
        return "TextImpl";
    }
}