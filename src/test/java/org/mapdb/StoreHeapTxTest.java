package org.mapdb;


public class StoreHeapTxTest extends EngineTest<StoreHeap>{


    @Override
    protected StoreHeap openEngine() {
        return new StoreHeap(false);
    }

    @Override boolean canReopen(){return false;}

    @Override boolean canRollback(){return true;}


}
