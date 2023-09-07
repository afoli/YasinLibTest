package ir.yasinlib.ylibtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyLogCat extends View {

    public MyLogCat(Context context) {
        super(context);
    }

    public MyLogCat(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLogCat(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyLogCat(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void printMyLogCatMessage(String tag, String message) {
        Toast.makeText(getContext(), "It is a message from Library : " +
                message, Toast.LENGTH_SHORT).show();
    }
}
