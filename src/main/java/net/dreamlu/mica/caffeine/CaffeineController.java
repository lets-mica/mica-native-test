//package net.dreamlu.mica.caffeine;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.Cache;
//import org.springframework.cache.CacheManager;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//public class CaffeineController {
//    @Autowired
//    private CacheManager cacheManager;
//
//    @GetMapping("cache")
//    public String cache(@RequestParam(defaultValue = "xxx") String xxx) {
//        Cache xxx1 = cacheManager.getCache("xxx#10s");
//        xxx1.put("x", xxx);
//        return xxx;
//    }
//
//    @Scheduled(fixedDelay = 100)
//    public void test() {
//        Cache xxx1 = cacheManager.getCache("xxx#10s");
//        System.out.println("cache: " + xxx1.get("x"));
//    }
//
//}
