package com.josecuentas.android_spannable.lib;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.ColorRes;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;

/**
 * Created by jcuentas on 29/12/16.
 */

public class SpanDecoration {

    private final Context mContext;
    private static SpanDecoration spanDecoration = null;

    public SpanDecoration(Context context) {
        mContext = context;
    }

    public static SpanDecoration build(Context context) {
        if (spanDecoration == null) {
            spanDecoration = new SpanDecoration(context);
        }
        return spanDecoration;
    }

    public Spannable spanColor(String text, @ColorRes
            int color) {
        Spannable spanText = new SpannableString(text);
        spanText.setSpan(new ForegroundColorSpan(getResources().getColor(color)), 0, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spanText;
    }
    /**
     *
     * @param style An integer constant describing the style for this span. Examples
     * include bold, italic, and normal. Values are constants defined
     * in {@link android.graphics.Typeface}.
     */
    public Spannable spanTypeface(String text, int style) {
        Spannable spanText = new SpannableString(text);
        spanText.setSpan(new StyleSpan(style), 0, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spanText;
    }

    public Spannable spanColorAndTypeface(String text, @ColorRes
            int color, int style) {
        Spannable spanText = new SpannableString(text);
        spanText.setSpan(new ForegroundColorSpan(getResources().getColor(color)), 0, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spanText.setSpan(new StyleSpan(style), 0, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spanText;
    }

    private Resources getResources() {
        return mContext.getResources();
    }
}
