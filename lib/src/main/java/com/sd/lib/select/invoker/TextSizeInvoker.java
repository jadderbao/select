package com.sd.lib.select.invoker;

import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

public class TextSizeInvoker implements PropertyInvoker<Integer>
{
    @Override
    public void invoke(View view, Integer value)
    {
        if (value == null)
            return;
        if (!(view instanceof TextView))
            throw new IllegalArgumentException("ofView must be instance of TextView");

        final TextView textView = (TextView) view;
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, value);
    }
}
