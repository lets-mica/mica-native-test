package net.dreamlu.mica;

import net.dreamlu.mica.caffeine.config.CaffeineAutoCacheManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.nativex.hint.AccessBits;
import org.springframework.nativex.hint.FieldHint;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching
@EnableScheduling
@SpringBootApplication
@NativeHint(types = {
        @TypeHint(types = CaffeineAutoCacheManager.class, access = AccessBits.ALL),
        @TypeHint(types = CaffeineCacheManager.class, access = AccessBits.ALL),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.UnsafeAccess",
                fields = @FieldHint(name = "UNSAFE", allowUnsafeAccess = true),
                access = AccessBits.PUBLIC_METHODS
        ),
        @TypeHint(types = Thread.class, access = AccessBits.DECLARED_FIELDS),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.PS",
                fields = {
                        @FieldHint(name = "key", allowUnsafeAccess = true),
                        @FieldHint(name = "value", allowUnsafeAccess = true)
                },
                access = AccessBits.DECLARED_CONSTRUCTORS
        ),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.PSA",
                fields = @FieldHint(name = "accessTime", allowUnsafeAccess = true),
                access = AccessBits.DECLARED_CONSTRUCTORS
        ),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.PSW",
                fields = @FieldHint(name = "writeTime", allowUnsafeAccess = true),
                access = AccessBits.DECLARED_CONSTRUCTORS
        ),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.StripedBuffer",
                fields = {@FieldHint(name = "tableBusy", allowUnsafeAccess = true)},
                access = AccessBits.ALL
        ),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.PSWMS", access = AccessBits.DECLARED_CONSTRUCTORS),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.SSA", access = AccessBits.ALL),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.SSLA", access = AccessBits.DECLARED_CONSTRUCTORS),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.SSLMSW", access = AccessBits.DECLARED_CONSTRUCTORS),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.SSMSW", access = AccessBits.DECLARED_CONSTRUCTORS),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.BoundedBuffer", access = AccessBits.ALL),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.BoundedBuffer$RingBuffer", access = AccessBits.ALL),
        @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.BLCHeader$DrainStatusRef",
                fields = @FieldHint(name = "drainStatus", allowUnsafeAccess = true),
                access = AccessBits.ALL
        )
})
public class MicaNativeTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicaNativeTestApplication.class, args);
    }

}
