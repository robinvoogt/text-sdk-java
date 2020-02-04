/*
 * The MIT License
 *
 * Copyright 2020 soufyan.bargach.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.cmtelecom.text.sdk.models.templates;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author soufyan.bargach
 */
public class TemplateCurrency {
    /// <summary>
    /// Currency code, for example USD or EUR
    /// </summary>
    @SerializedName("currency_code")
    public String CurrencyCode;
    /// <summary>
    /// Amount in currency_code times 1000
    /// </summary>
    /// <example>50110 EUR becomes €50.11 in the message</example>
    @SerializedName("amount_1000")
    public Long Amount;
}