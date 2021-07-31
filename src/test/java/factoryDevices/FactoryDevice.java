package factoryDevices;

public class FactoryDevice {

    public enum DeviceType{
        ANDROID,
        IOS,
        WINDOW_PHONE,
        CLOUD
    }

    public static IDevice make(DeviceType tipo){
        IDevice device;
        switch (tipo){
            case ANDROID:
                device= new Android();
                break;
            case IOS:
                device= new IOS();
                break;
            case WINDOW_PHONE:
                device= new WindowPhone();
                break;
            case CLOUD:
                device= new BrowserStack();
                break;
            default:
                device=new Android();
        }
        return device;
    }
}
