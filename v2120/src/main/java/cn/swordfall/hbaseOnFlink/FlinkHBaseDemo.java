package cn.swordfall.hbaseOnFlink;

import cn.swordfall.hbaseOnFlink.flinkBatchProcessing.HBaseOnFlinkBatchProcessingJava;

/**
 * @Author: Yang JianQiu
 * @Date: 2019/3/16 18:06
 */
public class FlinkHBaseDemo {
    public static void main(String[] args) throws Exception {
        HBaseOnFlinkBatchProcessingJava hofbp = new HBaseOnFlinkBatchProcessingJava();
        hofbp.readFromHBaseWithTableInputFormat();
    }
}