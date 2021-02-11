package fake.me.sofa.rpc.base;

/**
 * 为什么单独创建个接口，直接用现成的不好喝吗
 */
public interface ReferenceCounted {

    int refCnt();

    // + 1
    ReferenceCounted retain();


    // -1；
    boolean release();
}


