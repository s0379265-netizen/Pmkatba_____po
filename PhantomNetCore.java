import java.net.InetAddress;

public class PhantomNetCore {

    public static void main(String[] args) {

        System.out.println("=== PhantomNetCore Ping Test ===");

        if (!checkInternet()) {
            System.out.println("❌ اینترنت قطع است");
            return;
        }

        System.out.println("✅ اینترنت وصل است");

        ping("8.8.8.8");   // میتونی هر IP یا دامنه‌ای بزاری
    }

    // چک اینترنت
    public static boolean checkInternet() {
        try {
            InetAddress address = InetAddress.getByName("8.8.8.8");
            return address.isReachable(3000);
        } catch (Exception e) {
            return false;
        }
    }

    // گرفتن پینگ
    public static void ping(String host) {
        try {
            InetAddress address = InetAddress.getByName(host);

            long start = System.nanoTime();
            boolean reachable = address.isReachable(5000);
            long end = System.nanoTime();

            if (reachable) {
                long ping = (end - start) / 1_000_000;
                System.out.println("📶 Ping: " + ping + " ms");
            } else {
                System.out.println("⚠ مقصد در دسترس نیست");
            }

        } catch (Exception e) {
            System.out.println("❌ خطا در پینگ");
        }
    }
}
