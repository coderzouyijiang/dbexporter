package cn.zyj.dbexporter.constant;

/**
 * 枚举值用途
 */
public enum ToTextPurpose {
    DEFAULT, // 默认，用于展示。在详情页或列表中
    OPTION, // 用作选项。在创建或更新页中
    CONDITION, // 用作条件。在搜索页中
    EXPORT; // 用于导出。在excel中
}
