package com.josecuentas.android_spannable.lib;

import android.content.Context;
import android.os.Build;
import android.support.annotation.ColorRes;
import android.support.annotation.RequiresApi;
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

    public SpanDecorationBuild append(CharSequence text) {
        mSpannableStringBuilder.append(text);
        return this;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SpanDecorationBuild append(CharSequence text, Object what, int flags) {
        mSpannableStringBuilder.append(text, what, flags);
        return this;
    }

    public SpanDecorationBuild append(CharSequence text, int start, int end) {
        mSpannableStringBuilder.append(text, start, end);
        return this;
    }

    public SpanDecorationBuild append(char text) {
        mSpannableStringBuilder.append(text);
        return this;
    }


    public SpannableStringBuilder builder() {
        return mSpannableStringBuilder;
    }
}
