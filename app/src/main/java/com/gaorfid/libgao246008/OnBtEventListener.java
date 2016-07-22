package com.gaorfid.libgao246008;

import android.bluetooth.BluetoothDevice;

public interface OnBtEventListener
{
	//--- synch functions.
    abstract void onBtFoundNewDevice( BluetoothDevice device );
    abstract void onBtScanCompleted();
    abstract void onBtConnected( BluetoothDevice device );
    abstract void onBtDisconnected( BluetoothDevice device );
    abstract void onBtConnectFail( BluetoothDevice device, String msg );
    abstract void onBtDataSent( byte[] data );
    abstract void onBtDataTransException( BluetoothDevice device, String msg );

    //--- asynch function.
    abstract void onNotifyBtDataRecv();
}
