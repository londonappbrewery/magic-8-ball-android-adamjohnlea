package com.londonappbrewery.magiceightball;

/**
 * Created by adamjlea on 9/29/17.
 */

public interface AccelerometerListener {

    public void onAccelerationChanged(float x, float y, float z);

    public void onShake(float force);

}
