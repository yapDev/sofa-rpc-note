package fake.me.sofa.rpc.base;

// 销毁的接口，做什么用的 ？为什么不实用Closeable 接口
public interface Destroyable {

    void destroy();

    void destroy(DestroyHook hook);

    interface DestroyHook {
        void preDestroy();
        void postDestroy();
    }
}
