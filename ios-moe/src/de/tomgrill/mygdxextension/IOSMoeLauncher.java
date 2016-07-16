package de.tomgrill.mygdxextension;

import com.badlogic.gdx.backends.iosmoe.IOSApplication;
import com.badlogic.gdx.backends.iosmoe.IOSApplicationConfiguration;
import com.intel.moe.natj.general.Pointer;
import de.tomgrill.mygdxextension.MyGdxExtension;

import ios.foundation.NSAutoreleasePool;
import ios.uikit.c.UIKit;

public class IOSMoeLauncher extends IOSApplication.Delegate {

    protected IOSMoeLauncher(Pointer peer) {
        super(peer);
    }

    @Override
    protected IOSApplication createApplication() {
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        config.useAccelerometer = false;
        return new IOSApplication(new MyGdxExtension(), config);
    }

    public static void main(String[] argv) {
        NSAutoreleasePool pool = NSAutoreleasePool.alloc();
        UIKit.UIApplicationMain(0, null, null, IOSMoeLauncher.class.getName());
        pool.dealloc();
    }
}