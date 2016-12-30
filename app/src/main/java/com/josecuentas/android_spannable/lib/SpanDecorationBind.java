package com.josecuentas.android_spannable.lib;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.ColorRes;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;

/**
 * Created by jcuentas on 29/12/16.
 * v01
 */

public class SpanDecorationBind {

    private final Context mContext;
    private static SpanDecorationBind utilSpannable = null;
    SpannableStringBuilder mSpannableStringBuilder;

    public SpanDecorationBind(Context context) {
        mContext = context;
        mSpannableStringBuilder = new SpannableStringBuilder();
    }

    public static SpanDecorationBind build(Context context) {
        if (utilSpannable == null) {
            utilSpannable = new SpanDecorationBind(context);
        }
        return utilSpannable;
    }

    public SpanDecorationBind spanColor(String text, @ColorRes
            int color) {
        Spannable spanText = new SpannableString(text);
        spanText.setSpan(new ForegroundColorSpan(getResources().getColor(color)), 0, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        mSpannableStringBuilder.append(spanText);
        return this;
    }
    /**
     *
     * @param style An integer constant describing the style for this span. Examples
     * include bold, italic, and normal. Values are constants defined
     * in {@link android.graphics.Typeface}.
     */
    public SpanDecorationBind spanTypeface(String text, int style) {
        Spannable spanText = new SpannableString(text);
        spanText.setSpan(new StyleSpan(style), 0, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        mSpannableStringBuilder.append(spanText);
        return this;
    }

    public SpanDecorationBind spanColorAndTypeface(String text, @ColorRes
            int color, int style) {
        Spannable spanText = new SpannableString(text);
        spanText.setSpan(new ForegroundColorSpan(getResources().getColor(color)), 0, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spanText.setSpan(new StyleSpan(style), 0, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        mSpannableStringBuilder.append(spanText);
        return this;
    }

    public SpannableStringBuilder build() {
        return mSpannableStringBuilder;
    }

    private Resources getResources() {
        return mContext.getResources();
    }
}
