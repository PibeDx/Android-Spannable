package com.josecuentas.android_spannable.lib;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

/**
 * Created by jcuentas on 29/12/16.
 */

public class SpanDecorationBuild {
    private static SpanDecoration spanDecoration = null;
    private SpannableStringBuilder mSpannableStringBuilder = new SpannableStringBuilder();

    public static SpanDecorationBuild builder(Context context) {
        if (spanDecoration == null) {
            spanDecoration = new SpanDecoration(context);
        }
        return new SpanDecorationBuild();
    }

    public SpanDecorationBuild spanColor(String text, @ColorRes
            int color) {
        Spannable spannable = spanDecoration.spanColor(text, color);
        mSpannableStringBuilder.append(spannable);
        return this;
    }
    /**
     *
     * @param style An integer constant describing the style for this span. Examples
     * include bold, italic, and normal. Values are constants defined
     * in {@link android.graphics.Typeface}.
     */
    public SpanDecorationBuild spanTypeface(String text, int style) {
        Spannable spannable = spanDecoration.spanTypeface(text, style);
        mSpannableStringBuilder.append(spannable);
        return this;
    }

    public SpanDecorationBuild spanColorAndTypeface(String text, @ColorRes
            int color, int style) {
        Spannable spannable = spanDecoration.spanColorAndTypeface(text, color, style);
        mSpannableStringBuilder.append(spannable);
        return this;
    }

    public SpannableStringBuilder builder() {
        return mSpannableStringBuilder;
    }
}
