package com.jy.common.utils.echarts.code;

public enum Easing
{
    Linear("Linear", 0), 
    QuadraticIn("QuadraticIn", 1), 
    QuadraticOut("QuadraticOut", 2), 
    QuadraticInOut("QuadraticInOut", 3), 
    CubicIn("CubicIn", 4), 
    CubicOut("CubicOut", 5), 
    CubicInOut("CubicInOut", 6), 
    QuarticIn("QuarticIn", 7), 
    QuarticOut("QuarticOut", 8), 
    QuarticInOut("QuarticInOut", 9), 
    QuinticIn("QuinticIn", 10), 
    QuinticOut("QuinticOut", 11), 
    QuinticInOut("QuinticInOut", 12), 
    SinusoidalIn("SinusoidalIn", 13), 
    SinusoidalOut("SinusoidalOut", 14), 
    SinusoidalInOut("SinusoidalInOut", 15), 
    ExponentialIn("ExponentialIn", 16), 
    ExponentialOut("ExponentialOut", 17), 
    ExponentialInOut("ExponentialInOut", 18), 
    CircularIn("CircularIn", 19), 
    CircularOut("CircularOut", 20), 
    CircularInOut("CircularInOut", 21), 
    ElasticIn("ElasticIn", 22), 
    ElasticOut("ElasticOut", 23), 
    ElasticInOut("ElasticInOut", 24), 
    BackIn("BackIn", 25), 
    BackOut("BackOut", 26), 
    BackInOut("BackInOut", 27), 
    BounceIn("BounceIn", 28), 
    BounceOut("BounceOut", 29), 
    BounceInOut("BounceInOut", 30);
    
    private Easing(final String s, final int n) {
    }
}
