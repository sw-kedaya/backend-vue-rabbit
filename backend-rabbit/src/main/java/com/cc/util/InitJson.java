package com.cc.util;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class InitJson {
    public static final String CATEGORY_JSON = "{\"result\": [\n" +
            "        {\n" +
            "            \"id\": \"1005000\",\n" +
            "            \"name\": \"居家\",\n" +
            "            \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-05-06/201516e3-25d0-48f5-bcee-7f0cafb14176.png\",\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"id\": \"1005999003\",\n" +
            "                    \"name\": \"居家生活用品\",\n" +
            "                    \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-22/7f6a7b20-7902-4b43-b9c5-f33151ef1334.jpg?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1008017\",\n" +
            "                    \"name\": \"收纳\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/366989e4d730594e86fcd60b5ab19acc.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1017000\",\n" +
            "                    \"name\": \"宠物食品\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/b42a85ef15f856081ea9f49e5f6893e2.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109243003\",\n" +
            "                    \"name\": \"艺术藏品\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/9544b81aaa14c26a8038c2365ff3c2bc.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109248004\",\n" +
            "                    \"name\": \"宠物用品\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/e766b09029ca00680d1e651b5cdc42bd.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109293000\",\n" +
            "                    \"name\": \"家庭医疗\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/3f34039fa8c26e18e2f4fc96ed8cb6de.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109308000\",\n" +
            "                    \"name\": \"中医保健\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/2bfba997fd031317caecc4f0bad17569.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                }\n" +
            "            ],\n" +
            "            \"goods\": [\n" +
            "                {\n" +
            "                    \"id\": \"3997602\",\n" +
            "                    \"name\": \"暖腰暖腹暖胃，蕲艾暖宫腰带\",\n" +
            "                    \"desc\": \"暖宫暖腰暖胃，大面积热敷≈3片暖宝宝\",\n" +
            "                    \"price\": \"49.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/9892cc73945da1591fa5259ad076b23c.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3995284\",\n" +
            "                    \"name\": \"新年佳礼，家用SPA多功能按摩床垫\",\n" +
            "                    \"desc\": \"坐卧两用，随时随地做spa，多个场合随你心意\",\n" +
            "                    \"price\": \"599.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/c41003c6df90d7673195dcc2482e13f3.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3993828\",\n" +
            "                    \"name\": \"七夕礼物·姐姐同款，穿出自信体态矫姿带\",\n" +
            "                    \"desc\": \"背薄一寸，年轻十岁，时尚百搭，约会职场小心机\",\n" +
            "                    \"price\": \"159.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/a6939f41c48fa9e9c8f7a7ed855351f1.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3993481\",\n" +
            "                    \"name\": \"带提手可站立炫彩硅胶热水袋\",\n" +
            "                    \"desc\": \"杯型式设计，轻松注水防烫伤\",\n" +
            "                    \"price\": \"35.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/0b120e1c37f312981f4f2242997cc862.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3992367\",\n" +
            "                    \"name\": \"七夕礼物·挺拔身姿，隐形内穿矫姿带\",\n" +
            "                    \"desc\": \"众筹爆品回归，专注矫姿20年，轻松矫正身姿\",\n" +
            "                    \"price\": \"149.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/7d1bc78607a08c088b2a7cdbe88c05af.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3991840\",\n" +
            "                    \"name\": \"消炎镇痛一贴灵医用冷敷贴60贴/盒\",\n" +
            "                    \"desc\": \"mini型尺寸设计性价比更高\",\n" +
            "                    \"price\": \"79.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/d3807695c7d42a0247e308a936201d7c.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3987204\",\n" +
            "                    \"name\": \"真空拔罐器\",\n" +
            "                    \"desc\": \"居家养生必备超简便拔罐套装\",\n" +
            "                    \"price\": \"49.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/16222847be7d090eb538a944a7e0b01b.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3986121\",\n" +
            "                    \"name\": \"艾灸理疗随时随地，灸疗装置8头/12头\",\n" +
            "                    \"desc\": \"哪里不适灸哪里，全身都可灸\",\n" +
            "                    \"price\": \"99.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/941abaee58a88cb104228fe2c4cfdeb1.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3997974\",\n" +
            "                    \"name\": \"入门首选，语音播报电子血压计\",\n" +
            "                    \"desc\": \"全程语音指导，一键测量，监测心率，贴心守护爸妈健康\",\n" +
            "                    \"price\": \"109.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/8f0c15f981c5cbcb1aa17215a259fa62.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1005002\",\n" +
            "            \"name\": \"美食\",\n" +
            "            \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-05-06/cf82e5b4-bf1b-4c68-aa86-96f66e8e5282.png\",\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"id\": \"1005012\",\n" +
            "                    \"name\": \"南北干货\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/9af51a1090fd32f668b14451f06d6e72.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1036003\",\n" +
            "                    \"name\": \"调味酱菜\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/5fae33a840870b487cc903535383bf97.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109201001\",\n" +
            "                    \"name\": \"方便食品\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/f9872b4aad6c0a943d45629ac96ee8d3.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109206007\",\n" +
            "                    \"name\": \"米面粮油\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/8578759aed2268f7aa8641273cac7cb3.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109264007\",\n" +
            "                    \"name\": \"名酒馆\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/91413b1476a0697bb0592609a42d4498.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109285003\",\n" +
            "                    \"name\": \"进口酒\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/bf705060f01b60fe9c11c345931b1891.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                }\n" +
            "            ],\n" +
            "            \"goods\": [\n" +
            "                {\n" +
            "                    \"id\": \"1270008\",\n" +
            "                    \"name\": \"黄金玉粟粥米500克\",\n" +
            "                    \"desc\": \"谷物缤纷，香甜软糯\",\n" +
            "                    \"price\": \"9.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/5f62c7ab543b1152383a0e9941c09bfd.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1269010\",\n" +
            "                    \"name\": \"什锦素食粥米500克\",\n" +
            "                    \"desc\": \"谷香米糯，营养美味\",\n" +
            "                    \"price\": \"9.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/dc4826ddb838d8e17f90402adfa3f4fe.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1135081\",\n" +
            "                    \"name\": \"紫米410克\",\n" +
            "                    \"desc\": \"一年一熟的御田胭脂米\",\n" +
            "                    \"price\": \"19.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/a3c0bb3be38ccf510ecaedb81f5bcd9f.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1135080\",\n" +
            "                    \"name\": \"加量50%不加价，贵州兴仁薏仁米600克\",\n" +
            "                    \"desc\": \"粒粒饱满，颗颗香糯\",\n" +
            "                    \"price\": \"19.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/3e93790bba8db8aab54ee5ba72799567.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1135079\",\n" +
            "                    \"name\": \"免浸泡，12种谷物一次同享，五谷米400克\",\n" +
            "                    \"desc\": \"无需浸泡，同煮同熟\",\n" +
            "                    \"price\": \"9.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/bfe70bd66efe94f2f18061c707d2a097.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1135077\",\n" +
            "                    \"name\": \"加量45%不加价，内蒙古赤峰黄小米700克\",\n" +
            "                    \"desc\": \"赤峰好谷，米香浓郁\",\n" +
            "                    \"price\": \"19.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/564eb51c22d898179b468f5dec52d502.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1135076\",\n" +
            "                    \"name\": \"红小豆450克*3袋\",\n" +
            "                    \"desc\": \"皮薄易煮，粒粒香甜\",\n" +
            "                    \"price\": \"19.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/eaec90be370a438e565e10189b7a390a.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1135075\",\n" +
            "                    \"name\": \"来自东北的“黑珍珠”，黑米470克*3袋\",\n" +
            "                    \"desc\": \"米汁香稠，Q弹醇香\",\n" +
            "                    \"price\": \"19.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/1452cfeb14b5d252fb1ba97b278e9cc3.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3464033\",\n" +
            "                    \"name\": \"冻干藤椒豚骨面74克*12盒\",\n" +
            "                    \"desc\": \"日式风味，汤浓肉鲜，椒麻过瘾\",\n" +
            "                    \"price\": \"79.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/7a5ffe313fe5671709d5a9826f5a83a2.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1010000\",\n" +
            "            \"name\": \"服饰\",\n" +
            "            \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-05-06/33e1f5de-0fdb-4cfa-9ba9-781233024b53.png\",\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"id\": \"109303000\",\n" +
            "                    \"name\": \"钱包/胸包\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/237613bc9c22eb422dade63e3ed7c61a.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109311005\",\n" +
            "                    \"name\": \"女式靴子\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/62c5dacf3e0cbe8e4188ccd263358d1a.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109311006\",\n" +
            "                    \"name\": \"女式休闲鞋\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/8cd3a76ffffb14e9fe92ad2369117af0.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109311007\",\n" +
            "                    \"name\": \"女式运动鞋\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/7be561f2ddc2179a7e116c413636eba9.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109315000\",\n" +
            "                    \"name\": \"11.11购物狂欢\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/b29297263032957553d7153b309db74b.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109318003\",\n" +
            "                    \"name\": \"【年末狂欢季】\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/8f8092d5bf6a133a8cb59ab7b9f790e9.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                }\n" +
            "            ],\n" +
            "            \"goods\": [\n" +
            "                {\n" +
            "                    \"id\": \"1621018\",\n" +
            "                    \"name\": \"懒人瘦出好身材，多功能甩脂塑形机\",\n" +
            "                    \"desc\": \"懒人福音居家轻松塑身\",\n" +
            "                    \"price\": \"589.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/540f84174dbf9b98d4072abbd886819e.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1593000\",\n" +
            "                    \"name\": \"软糯似baby肌肤，男式高领纯小山羊绒衫\",\n" +
            "                    \"desc\": \"绒毛取自未满1岁的山羊羊羔\",\n" +
            "                    \"price\": \"559.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/06156761337ba0fd1f8f51470f698b5f.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1555000\",\n" +
            "                    \"name\": \"舒眠真丝眼罩\",\n" +
            "                    \"desc\": \"顺滑真丝，感受舒适睡眠\",\n" +
            "                    \"price\": \"79.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/85432452d5f40c4798c08f1f0beb4a43.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1436033\",\n" +
            "                    \"name\": \"柔软透气，女式精梳棉内裤6条装\",\n" +
            "                    \"desc\": \"爱慕供应商柔软透气\",\n" +
            "                    \"price\": \"125.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/dc30e9603306e59d959e7fac6968244e.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1281002\",\n" +
            "                    \"name\": \"轻灵碳素耐用型羽毛球拍单双拍\",\n" +
            "                    \"desc\": \"超轻球拍，运动随心\",\n" +
            "                    \"price\": \"119.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/89cc3ab3e332bb1df5dc20241b5ca4bb.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4001285\",\n" +
            "                    \"name\": \"英伦长柄自动晴雨伞\",\n" +
            "                    \"desc\": \"雨天有情调，英伦风设计，给你好品味\",\n" +
            "                    \"price\": \"40.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/e77b8f4a8ddd1e777394d84347859f7c.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4001126\",\n" +
            "                    \"name\": \"瑜伽裸感女式运动训练紧身裤\",\n" +
            "                    \"desc\": \"面料韧性足，修身又舒适\",\n" +
            "                    \"price\": \"83.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/872275c2e2edacc917e0364065c90121.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4000914\",\n" +
            "                    \"name\": \"恍若没穿鞋，女式轻软舒弹健步鞋2.0\",\n" +
            "                    \"desc\": \"宛若没穿鞋的轻盈，体验更自由的奔跑\",\n" +
            "                    \"price\": \"159.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/feec7bde4d52521ae70ab4c5010ce992.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4000620\",\n" +
            "                    \"name\": \"「一件三穿好过冬」男中长款鹅绒防水外套\",\n" +
            "                    \"desc\": \"一件衣服三种穿法，应对多变天气\",\n" +
            "                    \"price\": \"659.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/aa9e03278e3274a2a83f3f8e7df5ee6f.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1011000\",\n" +
            "            \"name\": \"母婴\",\n" +
            "            \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-05-06/b514a526-4010-4ce8-8cb9-757ed382f84a.png\",\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"id\": \"1020003\",\n" +
            "                    \"name\": \"T恤/polo/衬衫\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/1f0089afcec911db7202fbcdae57d5f8.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1037006\",\n" +
            "                    \"name\": \"儿童鞋\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/7fd14a409302391da16970981cacd336.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109243018\",\n" +
            "                    \"name\": \"外套/套装\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/773a8777f66c286f97af6d74a27d7fe1.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109243019\",\n" +
            "                    \"name\": \"裤子/裙装\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/a8c52cea5f953019484a74883ad8f14b.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109243021\",\n" +
            "                    \"name\": \"连体衣/礼盒\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/773677cc0922628152a9b3cbd862426f.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109243022\",\n" +
            "                    \"name\": \"学步鞋\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/9a50280bb69e1c12f557f601cce1c480.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                }\n" +
            "            ],\n" +
            "            \"goods\": [\n" +
            "                {\n" +
            "                    \"id\": \"4027473\",\n" +
            "                    \"name\": \"新款LOGO印花时尚学步叫叫鞋\",\n" +
            "                    \"desc\": \"软底包头叫叫鞋\",\n" +
            "                    \"price\": \"259.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/841d7669e6cc23cb249f47d8d39fc17c.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4027466\",\n" +
            "                    \"name\": \"儿童气泵软底学步二阶段学步鞋\",\n" +
            "                    \"desc\": \"气泵大底学步鞋\",\n" +
            "                    \"price\": \"239.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/19bedfd20a12842b5d7f7b909a62e877.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4023738\",\n" +
            "                    \"name\": \"舒适软弹，糖果色儿童网孔透气运动鞋25-30\",\n" +
            "                    \"desc\": \"防踢鞋头，透气网孔更舒适\",\n" +
            "                    \"price\": \"139.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/c437179bc1d0d5ad77a79f15a5c6f166.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4023641\",\n" +
            "                    \"name\": \"防踢鞋头，儿童学步健康机能鞋21-30\",\n" +
            "                    \"desc\": \"包头防踢用心呵护\",\n" +
            "                    \"price\": \"129.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/33ba674fbb13e2380ee8a74371eacf43.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4023638\",\n" +
            "                    \"name\": \"抓绒保暖，毛毛虫儿童运动鞋26-30\",\n" +
            "                    \"desc\": \"宝贝上脚活力出街\",\n" +
            "                    \"price\": \"109.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/d917c92e663c5ed0bb577c7ded73e4ec.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4007784\",\n" +
            "                    \"name\": \"婴幼儿童透气网面学步鞋小童鞋4-6码\",\n" +
            "                    \"desc\": \"优质透气网布鞋面，轻盈自在\",\n" +
            "                    \"price\": \"119.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/a9f428091f172db89977a511f6639fec.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3998535\",\n" +
            "                    \"name\": \"学步更自如，婴幼童机能学步鞋4-6码\",\n" +
            "                    \"desc\": \"宝宝的第一双鞋，成长不将就\",\n" +
            "                    \"price\": \"109.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/ef01de6dfac9cc4c548f317f2feddafe.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3995013\",\n" +
            "                    \"name\": \"时髦出街更亮眼，儿童休闲老爹鞋21-26码\",\n" +
            "                    \"desc\": \"高弹鞋底，行走脚感舒适\",\n" +
            "                    \"price\": \"109.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/088c9f9208b82fa4777336d22faa919d.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4023751\",\n" +
            "                    \"name\": \"释放可爱天性，棉毛布造型领哈衣59-90cm\",\n" +
            "                    \"desc\": \"A类婴幼儿标准，安全放心\",\n" +
            "                    \"price\": \"62.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/5e2b5629af983dadbceed483dd677eeb.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1013001\",\n" +
            "            \"name\": \"个护\",\n" +
            "            \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-05-06/d38a73b8-cd03-48aa-a60b-e7c4e16667ed.png\",\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"id\": \"1009000\",\n" +
            "                    \"name\": \"家庭清洁\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/718318c0d3b55d011fcb7c7c843902ce.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1020002\",\n" +
            "                    \"name\": \"浴室用品\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/dfb6142de1bd2f59b251eb8f7c7ea2fb.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109243016\",\n" +
            "                    \"name\": \"餐厨清洁\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/55d927e337c1f6d394359e99ef72a621.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109256012\",\n" +
            "                    \"name\": \"纸品\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/07fef43b0d14882d6662233ab30dc588.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109256013\",\n" +
            "                    \"name\": \"干湿巾\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/985897ea31fdfc159e12696f4dbb4c13.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109261055\",\n" +
            "                    \"name\": \"毛巾浴巾\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/949c5f8b077cf386ff9f1f18bec3408b.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                }\n" +
            "            ],\n" +
            "            \"goods\": [\n" +
            "                {\n" +
            "                    \"id\": \"3987992\",\n" +
            "                    \"name\": \"【新疆棉】简约山形纹全棉提花毛巾\",\n" +
            "                    \"desc\": \"新疆长绒棉毛巾，吸水好颜值高\",\n" +
            "                    \"price\": \"18.50\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/e0cea368f41da1587b3b7fc523f169d7.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3436033\",\n" +
            "                    \"name\": \"1件装【新疆棉】云珍·轻软旅行长绒棉方巾\",\n" +
            "                    \"desc\": \"轻巧无捻小方巾，旅行便携\",\n" +
            "                    \"price\": \"7.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/99c83709ca5f9fd5c5bb35d207ad7822.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1436010\",\n" +
            "                    \"name\": \"囤货装云珍·轻软旅行长绒棉毛巾6条装\",\n" +
            "                    \"desc\": \"触碰云软，热销50万条\",\n" +
            "                    \"price\": \"139.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/f4ed2e5d7b268bb270bce9ce63122ec0.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1129016\",\n" +
            "                    \"name\": \"【新疆棉】快速擦干，阿瓦提长绒棉毛巾\",\n" +
            "                    \"desc\": \"瞬间吸水，亲肤近0掉毛率\",\n" +
            "                    \"price\": \"16.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/2f4ff18d601494cb7805ee099ed8a50f.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1021000\",\n" +
            "                    \"name\": \"厚厚一按就干爽，埃及进口长绒棉毛巾\",\n" +
            "                    \"desc\": \"厚实大毛圈，干爽瞬吸\",\n" +
            "                    \"price\": \"16.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/a5c5398a7c033edb8a052fe1fddf8a81.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1009026\",\n" +
            "                    \"name\": \"【新疆棉】云珍·轻软长绒棉浴巾\",\n" +
            "                    \"desc\": \"云朵般轻软，至柔至软\",\n" +
            "                    \"price\": \"129.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/957d7a338fc0de044965cc279fce68b2.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1006051\",\n" +
            "                    \"name\": \"【新疆棉】云珍·轻软旅行长绒棉毛巾\",\n" +
            "                    \"desc\": \"轻软亲肤，热销50万条\",\n" +
            "                    \"price\": \"31.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/2a16452169f9d2e8841ddef76fdd684a.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1006029\",\n" +
            "                    \"name\": \"【新疆棉】宝宝也能用，全棉华夫格毛巾\",\n" +
            "                    \"desc\": \"空气华夫格，自然新疆棉\",\n" +
            "                    \"price\": \"15.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/3480e3fa68b810f23afb43f6bf2fe45b.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3465081\",\n" +
            "                    \"name\": \"清洁养护一片搞定皮革护理湿巾\",\n" +
            "                    \"desc\": \"一擦如新懒人必备\",\n" +
            "                    \"price\": \"9.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/bc32744cdf844b5136d3d84b0e6ba9d4.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1019000\",\n" +
            "            \"name\": \"严选\",\n" +
            "            \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-05-06/4b02f01f-a365-4b6c-9f7a-8b0f591dda02.png\",\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"id\": \"1065004\",\n" +
            "                    \"name\": \"滋补保健\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/1e619a2b22f40bf83070e6f8f6e0c8ff.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109256014\",\n" +
            "                    \"name\": \"床品家纺\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/e6580910c1f98ed61bda867aeaf07929.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109256015\",\n" +
            "                    \"name\": \"锅具配件\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/50ccbf04857e86cccf44d25da0577deb.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109275000\",\n" +
            "                    \"name\": \"清洁用品\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/926d919bc3e95f5c93dc5dc973faa378.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109309012\",\n" +
            "                    \"name\": \"个护电器\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/7a0eea3c515ad247c092749bcdd29855.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                }\n" +
            "            ],\n" +
            "            \"goods\": [\n" +
            "                {\n" +
            "                    \"id\": \"4000009\",\n" +
            "                    \"name\": \"医美级冰脱韩国Ulike蓝宝石脉冲光脱毛仪\",\n" +
            "                    \"desc\": \"蓝宝石冰点脱毛，高效更持久\",\n" +
            "                    \"price\": \"1599.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/3567b2ac2526e6b89124f3fb62fd09d3.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4027998\",\n" +
            "                    \"name\": \"亮碟多效合一洗涤块495g\",\n" +
            "                    \"desc\": \"洗碗机专用，强力去污\",\n" +
            "                    \"price\": \"69.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/e07c2b63765cf9f4a46d489c6e09c1c1.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4017718\",\n" +
            "                    \"name\": \"油污克星Mootaa重油污清洁剂\",\n" +
            "                    \"desc\": \"一喷快速溶解油污\",\n" +
            "                    \"price\": \"26.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/53a1579ead54c61a9b296d20c78a67ff.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4010699\",\n" +
            "                    \"name\": \"除味净化神器Mootaa冰箱抑菌清洁剂250ml\",\n" +
            "                    \"desc\": \"除臭杀毒，持久保鲜，解决冰箱各种食材串味产生的难闻气味\",\n" +
            "                    \"price\": \"35.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/838c1b94f15e3b200bea21cef8989592.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3999485\",\n" +
            "                    \"name\": \"意大利大公鸡管家重油污克星清洁剂625ml\",\n" +
            "                    \"desc\": \"强效去污，操作便捷\",\n" +
            "                    \"price\": \"39.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/6a669deef604cd8f080991b3207a3078.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3998109\",\n" +
            "                    \"name\": \"强力去垢不伤锅天然棕榈清洁刷长/短款\",\n" +
            "                    \"desc\": \"短柄针对顽渍，长柄清洁死角\",\n" +
            "                    \"price\": \"8.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/7537da93f26f0303d94c59f3889836ed.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3990408\",\n" +
            "                    \"name\": \"1滴强力去污澳洲超浓缩不伤手洗洁精400ml\",\n" +
            "                    \"desc\": \"温和高效去污，一瓶可作多用\",\n" +
            "                    \"price\": \"17.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/9ffdc0b1f6dbbe2e9f10a187444c01a3.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3990343\",\n" +
            "                    \"name\": \"【囤货装】日本橙油精华去油污泡沫3瓶装\",\n" +
            "                    \"desc\": \"强力除油污，萃取橙油精华\",\n" +
            "                    \"price\": \"67.50\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/188e05584a056b0e2f17e8c568da8c00.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4023839\",\n" +
            "                    \"name\": \"日本冰块冰球制冰模具\",\n" +
            "                    \"desc\": \"轻轻一拍，轻松取冰\",\n" +
            "                    \"price\": \"29.80\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/2be38fc160992fe41f7d4a45bd0f90e5.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1043000\",\n" +
            "            \"name\": \"数码\",\n" +
            "            \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-05-06/9660870d-6a59-4624-8064-b3a8cbf50d5c.png\",\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"id\": \"1008006\",\n" +
            "                    \"name\": \"影音娱乐\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/f5797ca77cfe413e7753ec69f9bd4bb1.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1022000\",\n" +
            "                    \"name\": \"3C数码\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/99b8f97b2e5449606fd558574aa15982.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1028001\",\n" +
            "                    \"name\": \"乐器\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/da0ac345e98c04594b697b56ebc373a5.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109243035\",\n" +
            "                    \"name\": \"手机配件\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/0276d68f4b7a03bbd16675ada6e707ff.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109243036\",\n" +
            "                    \"name\": \"车载用品\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/3f45fbcdac7e8532b6a1570e6d7fe171.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109243046\",\n" +
            "                    \"name\": \"办公文具\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/801583d2f58274b13dc6a03daed1c3c9.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                }\n" +
            "            ],\n" +
            "            \"goods\": [\n" +
            "                {\n" +
            "                    \"id\": \"3529022\",\n" +
            "                    \"name\": \"书源彩色按动中性笔\",\n" +
            "                    \"desc\": \"化繁为简，书写本源\",\n" +
            "                    \"price\": \"13.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/21216556e7d47a4e4277dcb36a16a486.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3506005\",\n" +
            "                    \"name\": \"意外设计小时光便携钢笔\",\n" +
            "                    \"desc\": \"精致与优雅随身藏\\n4.16-4.19号停止发货\",\n" +
            "                    \"price\": \"328.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/f3636b063dad944aa527e4652392a553.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3499024\",\n" +
            "                    \"name\": \"创意金属立体拼酷模型\",\n" +
            "                    \"desc\": \"凤舞龙翔呈现华丽视觉\",\n" +
            "                    \"price\": \"158.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/f3784ed01706f2f2722f12410a6429c9.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3468024\",\n" +
            "                    \"name\": \"意外设计便携钢笔花信礼盒\",\n" +
            "                    \"desc\": \"生活的美，诗人的心\\n4.16-4.19号停止发货\",\n" +
            "                    \"price\": \"398.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/cc1c57b701f202bc585d8fff3b65571e.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1512000\",\n" +
            "                    \"name\": \"用心记录每一句诗，飞鸟集钢笔本册文具礼盒\",\n" +
            "                    \"desc\": \"谱写情谊之歌\",\n" +
            "                    \"price\": \"89.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/3892e311f3494d2bcc2c1f8ed9e34271.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1458011\",\n" +
            "                    \"name\": \"谱写爱的篇章，莫扎特钢笔墨水礼盒\",\n" +
            "                    \"desc\": \"谱写爱的乐章\",\n" +
            "                    \"price\": \"88.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/b20165617d2f901e9ad926f39b737e87.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1111002\",\n" +
            "                    \"name\": \"剪出精致感，金致圆柄复古剪刀\",\n" +
            "                    \"desc\": \"轻薄设计，简约大方\",\n" +
            "                    \"price\": \"9.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/4c6a9c8a579b00e5e9c7b002d15a33a2.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3994432\",\n" +
            "                    \"name\": \"平台严选x敦煌博物馆鹿游仙踪植萃车载香氛\",\n" +
            "                    \"desc\": \"复古敦煌色系，植萃天然香氛，安全健康孕婴可用\",\n" +
            "                    \"price\": \"33.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/15db90ea8c8c7456c1fee4e18abb25da.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3992720\",\n" +
            "                    \"name\": \"旅途手机好伴侣，三合一车载手机支架\",\n" +
            "                    \"desc\": \"带安全锤和应急割刀的手机支架\",\n" +
            "                    \"price\": \"49.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/2245a3d6898361236babb66d834e19c8.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"109243029\",\n" +
            "            \"name\": \"运动\",\n" +
            "            \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-05-06/7d19752c-baff-49b6-bd02-5ece1d729214.png\",\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"id\": \"109312000\",\n" +
            "                    \"name\": \"健身大器械\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/6a1d37ffb2e28622a71e3c4415eaee35.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109312001\",\n" +
            "                    \"name\": \"健身小器械\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/8c9f060e6fddb2b75af851a9a2c60087.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109312002\",\n" +
            "                    \"name\": \"城市出行\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/b41b50710c3823f44a9f5b549a67ca81.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109312003\",\n" +
            "                    \"name\": \"运动护具\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/ef9bcb99d88b3a1cfd9d2e120c158c21.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109313000\",\n" +
            "                    \"name\": \"垂钓\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/c4eeeae307d0562cf3e95303146282b2.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"109313003\",\n" +
            "                    \"name\": \"户外装备\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/6bbd92c68741c857d842f0afd1c7bdd5.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                }\n" +
            "            ],\n" +
            "            \"goods\": [\n" +
            "                {\n" +
            "                    \"id\": \"3996603\",\n" +
            "                    \"name\": \"飞宇出游拍摄防抖神器手机稳定器\",\n" +
            "                    \"desc\": \"小巧便携，三轴防抖，模式随心选\",\n" +
            "                    \"price\": \"439.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/2d0a47a51fa4b3e3857f2010bd83bead.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3995454\",\n" +
            "                    \"name\": \"黑科技专利款100%防水保暖针织毛线帽\",\n" +
            "                    \"desc\": \"黑科技专利，做到真正的保暖防水\",\n" +
            "                    \"price\": \"135.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/3683d874b9623434a10b4ab0c2e6be9f.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3994572\",\n" +
            "                    \"name\": \"伊海诗冬日出行多功能防风保暖围脖\",\n" +
            "                    \"desc\": \"时尚针织印花面料，多种穿戴方式，正反两穿，亲肤保暖\",\n" +
            "                    \"price\": \"35.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/25effebb31ea6fc58b92f5a6aecda8b9.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3994179\",\n" +
            "                    \"name\": \"运动健身跑步腰包\",\n" +
            "                    \"desc\": \"防水反光设计，大容量双口袋收纳，运动跑步更时尚\",\n" +
            "                    \"price\": \"40.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/610a693cfd6f01adc6923dc1c0ec91aa.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3993694\",\n" +
            "                    \"name\": \"可触屏户外出行手套-合集\",\n" +
            "                    \"desc\": \"户外轻松骑行\",\n" +
            "                    \"price\": \"69.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/264df9f0faddb60e88a8b108058d25e6.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3988016\",\n" +
            "                    \"name\": \"户外快干轻巧遮阳帽\",\n" +
            "                    \"desc\": \"有效遮阳，可折叠收纳\",\n" +
            "                    \"price\": \"44.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/310eac832a1d90fbea41c4e6a9e604e4.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3987478\",\n" +
            "                    \"name\": \"可折叠户外防紫外线鸭舌帽\",\n" +
            "                    \"desc\": \"可折叠，透气网纱棒球帽\",\n" +
            "                    \"price\": \"44.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/87fbba3cf009e5b69dd14781c594ef79.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"3550194\",\n" +
            "                    \"name\": \"防晒快干长檐棒球帽\",\n" +
            "                    \"desc\": \"遮阳防晒,保暖新潮\",\n" +
            "                    \"price\": \"69.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/7d0b373a6a63882783202c836bae264d.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"4026116\",\n" +
            "                    \"name\": \"探险者黑胶防晒防雨遮阳伞户外钓鱼伞\",\n" +
            "                    \"desc\": \"防雨遮阳隔绝紫外线\",\n" +
            "                    \"price\": \"169.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/66090c5de391e43e4516601e14870842.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"19999999\",\n" +
            "            \"name\": \"杂项\",\n" +
            "            \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-05-06/4ff20b9e-8150-4bd3-87a3-0cd6766938dd.png\",\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"id\": \"19999999001\",\n" +
            "                    \"name\": \"家庭清洁杂项\",\n" +
            "                    \"picture\": \"https://yanxuan.nosdn.127.net/718318c0d3b55d011fcb7c7c843902ce.png?quality=95&imageView\",\n" +
            "                    \"children\": null,\n" +
            "                    \"goods\": null\n" +
            "                }\n" +
            "            ],\n" +
            "            \"goods\": [\n" +
            "                {\n" +
            "                    \"id\": \"1589017\",\n" +
            "                    \"name\": \"分场景使用不污染，超细纤维抹布分类5件套\",\n" +
            "                    \"desc\": \"精细分工，洁净家居\",\n" +
            "                    \"price\": \"14.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/c520bba8209bae877158e8810d889aca.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1548001\",\n" +
            "                    \"name\": \"添加茂金属更强韧，金属色垃圾袋\",\n" +
            "                    \"desc\": \"3卷90只，茂金属添加，柔韧加倍\",\n" +
            "                    \"price\": \"8.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/251393c0d8db7b0b594ccf86f1e796d0.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1540017\",\n" +
            "                    \"name\": \"随用随丢，懒人真爱地板清洁/除菌湿巾\",\n" +
            "                    \"desc\": \"材质加厚，耐磨珍珠纹\",\n" +
            "                    \"price\": \"8.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/4c8a1cf2b8e40c250870491307dde11f.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1525018\",\n" +
            "                    \"name\": \"灰尘毛发静电吸附地板除尘干巾40片/包\",\n" +
            "                    \"desc\": \"干湿两用，静电除尘\",\n" +
            "                    \"price\": \"7.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/cf7584e037706a8df54fecfc6dfdd2af.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1306019\",\n" +
            "                    \"name\": \"日式和风简约无盖垃圾桶11L\",\n" +
            "                    \"desc\": \"敞口设计易洗易干触手可得的洁净与精致\",\n" +
            "                    \"price\": \"9.90\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/ca7144b1f5fda5528dd8e4c40abc3bcc.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1306017\",\n" +
            "                    \"name\": \"大容量干湿分类，脚踏缓降静音垃圾桶\",\n" +
            "                    \"desc\": \"一踩开合，解放双手\",\n" +
            "                    \"price\": \"89.00\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/1b322ed8c25f94f1fbf39ddb5fedeb47.jpg\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1085007\",\n" +
            "                    \"name\": \"一抽即提，免脏手，加厚抽绳垃圾袋3卷60只\",\n" +
            "                    \"desc\": \"18μm及10μm两种厚度，袋身不怕漏，3秒抽绳不脏手\",\n" +
            "                    \"price\": \"9.50\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/72af0b7c1d7b0b9710de621788326d2b.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": \"1076004\",\n" +
            "                    \"name\": \"软糯治愈系擦手，雪尼尔擦手球\",\n" +
            "                    \"desc\": \"吸水快干，不易掉屑\",\n" +
            "                    \"price\": \"9.50\",\n" +
            "                    \"picture\": \"https://yanxuan-item.nosdn.127.net/43d99e9b97cc55033b0f59b95a91ae49.png\",\n" +
            "                    \"discount\": null,\n" +
            "                    \"orderNum\": null\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    public static final String BANNER_JSON = "{\"result\": [\n" +
            "        {\n" +
            "            \"id\": \"16\",\n" +
            "            \"imgUrl\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-15/dfc11bb0-4af5-4e9b-9458-99f615cc685a.jpg\",\n" +
            "            \"hrefUrl\": \"/category/1005000\",\n" +
            "            \"type\": \"1\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"18\",\n" +
            "            \"imgUrl\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-15/1ba86bcc-ae71-42a3-bc3e-37b662f7f07e.jpg\",\n" +
            "            \"hrefUrl\": \"/category/1013001\",\n" +
            "            \"type\": \"1\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"19\",\n" +
            "            \"imgUrl\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-15/6d202d8e-bb47-4f92-9523-f32ab65754f4.jpg\",\n" +
            "            \"hrefUrl\": \"/category/1013001\",\n" +
            "            \"type\": \"1\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"20\",\n" +
            "            \"imgUrl\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-15/e83efb1b-309c-46f7-98a3-f1fefa694338.jpg\",\n" +
            "            \"hrefUrl\": \"/category/1005000\",\n" +
            "            \"type\": \"1\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"17\",\n" +
            "            \"imgUrl\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-15/4a79180a-1a5a-4042-8a77-4db0b9c800a8.jpg\",\n" +
            "            \"hrefUrl\": \"/category/1019000\",\n" +
            "            \"type\": \"1\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";
    public static final String GOODS_NEW_JSON = "{\"result\": [\n" +
            "        {\n" +
            "            \"id\": \"4008506\",\n" +
            "            \"name\": \"平步青云财神家居摆件\",\n" +
            "            \"desc\": \"艺术家瞿广慈作品，手绘上色，礼盒包装\",\n" +
            "            \"price\": \"646.00\",\n" +
            "            \"picture\": \"https://yanxuan-item.nosdn.127.net/9d5d0083264344b5d85acde13570d025.jpg\",\n" +
            "            \"discount\": null,\n" +
            "            \"orderNum\": 60\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"3996270\",\n" +
            "            \"name\": \"超能装多功能出行胸包\",\n" +
            "            \"desc\": \"小身材，大容量，时尚出行\",\n" +
            "            \"price\": \"49.00\",\n" +
            "            \"picture\": \"https://yanxuan-item.nosdn.127.net/59b98ddea6422e71de8cec507865984f.png\",\n" +
            "            \"discount\": null,\n" +
            "            \"orderNum\": 15\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"4000464\",\n" +
            "            \"name\": \"趣玩奶酪纯PC拉链拉杆箱（14/20/24/26寸）\",\n" +
            "            \"desc\": \"萌趣外形，实用功能，开启愉快旅程\",\n" +
            "            \"price\": \"199.00\",\n" +
            "            \"picture\": \"https://yanxuan-item.nosdn.127.net/ee5ae3974a18a93f3f4704fe70075e10.png\",\n" +
            "            \"discount\": null,\n" +
            "            \"orderNum\": 38\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"3997974\",\n" +
            "            \"name\": \"入门首选，语音播报电子血压计\",\n" +
            "            \"desc\": \"全程语音指导，一键测量，监测心率，贴心守护爸妈健康\",\n" +
            "            \"price\": \"109.00\",\n" +
            "            \"picture\": \"https://yanxuan-item.nosdn.127.net/8f0c15f981c5cbcb1aa17215a259fa62.png\",\n" +
            "            \"discount\": null,\n" +
            "            \"orderNum\": 17\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    public static final String HOT_JSON = "{\"result\": [\n" +
            "        {\n" +
            "            \"id\": \"1001\",\n" +
            "            \"picture\": \"https://yjy-oss-files.oss-cn-zhangjiakou.aliyuncs.com/tuxian/popular_1.jpg\",\n" +
            "            \"title\": \"特惠推荐\",\n" +
            "            \"alt\": \"它们最实惠\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1002\",\n" +
            "            \"picture\": \"https://yjy-oss-files.oss-cn-zhangjiakou.aliyuncs.com/tuxian/popular_2.jpg\",\n" +
            "            \"title\": \"爆款推荐\",\n" +
            "            \"alt\": \"它们最受欢迎\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1003\",\n" +
            "            \"picture\": \"https://yjy-oss-files.oss-cn-zhangjiakou.aliyuncs.com/tuxian/popular_3.jpg\",\n" +
            "            \"title\": \"一站买全\",\n" +
            "            \"alt\": \"使用场景下精心优选\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1004\",\n" +
            "            \"picture\": \"https://yjy-oss-files.oss-cn-zhangjiakou.aliyuncs.com/tuxian/popular_4.jpg\",\n" +
            "            \"title\": \"领券中心\",\n" +
            "            \"alt\": \"更多超值优惠券\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    public static final String CATEGORY_1005000_JSON ="{\"result\": {\n" +
            "        \"id\": \"1005000\",\n" +
            "        \"name\": \"居家\",\n" +
            "        \"picture\": null,\n" +
            "        \"children\": [\n" +
            "            {\n" +
            "                \"id\": \"1005999003\",\n" +
            "                \"name\": \"居家生活用品\",\n" +
            "                \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-22/7f6a7b20-7902-4b43-b9c5-f33151ef1334.jpg\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3995885\",\n" +
            "                        \"name\": \"飞天53%vol500ml贵州茅台酒（带杯）\",\n" +
            "                        \"desc\": \"茅台飘香，正品溯源\",\n" +
            "                        \"price\": \"1499.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/d46e005025a5d3b73c4781d31b327558.jpg\",\n" +
            "                        \"orderNum\": 559\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1379052170040578049\",\n" +
            "                        \"name\": \"极光限定 珠光蓝珐琅锅\",\n" +
            "                        \"desc\": null,\n" +
            "                        \"price\": \"199.00\",\n" +
            "                        \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-05/7f483771-6831-4a7a-abdb-2625acb755f3.png\",\n" +
            "                        \"orderNum\": 61\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1369155859933827074\",\n" +
            "                        \"name\": \"钻石陶瓷涂层多用锅18cm 小奶锅\",\n" +
            "                        \"desc\": \"安全耐用，易于清洗\",\n" +
            "                        \"price\": \"149.00\",\n" +
            "                        \"picture\": \"http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-05/6fdcac19-dd44-442c-9212-f7ec3cf3ed18.jpg\",\n" +
            "                        \"orderNum\": 1303\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"1008017\",\n" +
            "                \"name\": \"收纳\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/366989e4d730594e86fcd60b5ab19acc.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"1183010\",\n" +
            "                        \"name\": \"给衣柜减减肥，真空防潮压缩袋\",\n" +
            "                        \"desc\": \"手动压缩，节省空间\",\n" +
            "                        \"price\": \"79.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/06461cea9e56b56dd4276e1cb81dd884.png\",\n" +
            "                        \"orderNum\": 379\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1252031\",\n" +
            "                        \"name\": \"换季好帮手，大容量防尘衣物收纳袋\",\n" +
            "                        \"desc\": \"棉被收纳，干净防尘\",\n" +
            "                        \"price\": \"69.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/75f6cc2c037c09e957cbcc336cf4a652.png\",\n" +
            "                        \"orderNum\": 464\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1225018\",\n" +
            "                        \"name\": \"可水洗的布艺收纳盒\",\n" +
            "                        \"desc\": \"三种规格，收纳杂物\",\n" +
            "                        \"price\": \"29.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/5a608974e36c829898df20fd0ebf184a.png\",\n" +
            "                        \"orderNum\": 518\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1131025\",\n" +
            "                        \"name\": \"开发员自留款，带滚轮双层脏衣篓\",\n" +
            "                        \"desc\": \"滚轮设计，双层收纳\",\n" +
            "                        \"price\": \"125.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/8147e4685e5a0e47c1624772ee868fcc.jpg\",\n" +
            "                        \"orderNum\": 614\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1028004\",\n" +
            "                        \"name\": \"衣柜省空间神器，棉麻涤·收纳挂袋\",\n" +
            "                        \"desc\": \"实用棉麻，悬挂牢固\",\n" +
            "                        \"price\": \"55.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/49e21db0fe13c0ff1789a79a8ba48468.jpg\",\n" +
            "                        \"orderNum\": 208\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"1017000\",\n" +
            "                \"name\": \"宠物食品\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/b42a85ef15f856081ea9f49e5f6893e2.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3847005\",\n" +
            "                        \"name\": \"浓缩的精华，宠物化毛营养膏120克/支\",\n" +
            "                        \"desc\": \"温和化毛，补充营养，二合一\",\n" +
            "                        \"price\": \"39.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/a36c88ef48b14320166fab465686479f.jpg\",\n" +
            "                        \"orderNum\": 246\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3407081\",\n" +
            "                        \"name\": \"全面助力发育，全价幼猫粮（阶段）1.8千克\",\n" +
            "                        \"desc\": \"营养易吸收，严苛选料，健康成长\",\n" +
            "                        \"price\": \"99.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/395e781595f60b4e2c7aaab2420da3cd.png\",\n" +
            "                        \"orderNum\": 156\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3425016\",\n" +
            "                        \"name\": \"定制专属配方，全价中大型犬犬粮2千克\",\n" +
            "                        \"desc\": \"呵护关节，稳健成长健骨骼\",\n" +
            "                        \"price\": \"69.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/536a8d363b0324f8c03cb37b795fcdfb.png\",\n" +
            "                        \"orderNum\": 176\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3405016\",\n" +
            "                        \"name\": \"无谷慕斯罐头（猫）170克*12罐\",\n" +
            "                        \"desc\": \"三文鱼研磨，添加时令鱼籽\",\n" +
            "                        \"price\": \"132.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/9736c4ff50a9481e527b27e8aad61f03.png\",\n" +
            "                        \"orderNum\": 150\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3425018\",\n" +
            "                        \"name\": \"定制配方，专属营养，全价小型犬犬粮\",\n" +
            "                        \"desc\": \"呵护肠胃，美毛亮毛补营养\",\n" +
            "                        \"price\": \"69.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/ef56a7139fffe2650a7cd74deafd08da.png\",\n" +
            "                        \"orderNum\": 208\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109243003\",\n" +
            "                \"name\": \"艺术藏品\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/9544b81aaa14c26a8038c2365ff3c2bc.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4000295\",\n" +
            "                        \"name\": \"星云吉彩系列花器新年创意花瓶摆件朱炳仁\",\n" +
            "                        \"desc\": \"星云吉彩，一路繁花。花瓶造型挺秀、俏丽，更为丰满圆润；五彩斑斓色彩，莹润光泽的质感，又显娇嫩。置于台前感受花与花器的和谐之美，获得精神的美感和愉悦。采用国家非遗百年传统工艺及国艺釉彩铜独创工艺，简约时尚的设计，雅致意趣。\",\n" +
            "                        \"price\": \"442.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/2dd8fe9b59774c7ca160bb2d5741c763.jpg\",\n" +
            "                        \"orderNum\": 214\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4001920\",\n" +
            "                        \"name\": \"朱炳仁铜·猫型吉祥物装饰工艺摆件\",\n" +
            "                        \"desc\": \"灵性十足的黑色招财猫，周而复始，财源不断\",\n" +
            "                        \"price\": \"1888.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/6e38fc94a8fe72c9d139bc48ba6d9814.jpg\",\n" +
            "                        \"orderNum\": 190\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4001798\",\n" +
            "                        \"name\": \"海洋之歌·艺术雕塑摆件\",\n" +
            "                        \"desc\": \"白夜通话番外系列《海洋之歌》，温暖治愈\",\n" +
            "                        \"price\": \"67.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/c25af46c2d3df0cbf933dd31c5e7ad6a.jpg\",\n" +
            "                        \"orderNum\": 279\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4008506\",\n" +
            "                        \"name\": \"平步青云财神家居摆件\",\n" +
            "                        \"desc\": \"艺术家瞿广慈作品，手绘上色，礼盒包装\",\n" +
            "                        \"price\": \"646.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/9d5d0083264344b5d85acde13570d025.jpg\",\n" +
            "                        \"orderNum\": 256\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4001880\",\n" +
            "                        \"name\": \"朱炳仁·铜彩色生肖铜雕摆件\",\n" +
            "                        \"desc\": \"十二生肖萌宝系列吉祥物，吉祥又好运\",\n" +
            "                        \"price\": \"680.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/04753036f123a8ff1b56db60fe440f47.jpg\",\n" +
            "                        \"orderNum\": 156\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109248004\",\n" +
            "                \"name\": \"宠物用品\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/e766b09029ca00680d1e651b5cdc42bd.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4000278\",\n" +
            "                        \"name\": \"不易带出，3毫米原味豆腐猫砂2.6千克\",\n" +
            "                        \"desc\": \"经典3mm颗粒，强吸水，强包裹\",\n" +
            "                        \"price\": \"29.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/9d9590bdb4f7cdd874de6a4554abcff9.jpg\",\n" +
            "                        \"orderNum\": 173\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3986658\",\n" +
            "                        \"name\": \"快速吸水防回渗，宠物训导垫S码80片/袋\",\n" +
            "                        \"desc\": \"漏斗般吸水，一垫多用更省心\",\n" +
            "                        \"price\": \"35.80\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/17f5a18b4125733023cad09d6b7852db.jpg\",\n" +
            "                        \"orderNum\": 286\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3990698\",\n" +
            "                        \"name\": \"三重除臭，高效结团，混合猫砂2.5千克\",\n" +
            "                        \"desc\": \"科学配比，四效合一\",\n" +
            "                        \"price\": \"29.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/93b61911db2b55185aefd4b92bc52d26.png\",\n" +
            "                        \"orderNum\": 326\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3990319\",\n" +
            "                        \"name\": \"智能饮水机滤芯三片装\",\n" +
            "                        \"desc\": \"生物感应，紫外除菌，健康活泉\",\n" +
            "                        \"price\": \"42.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/240983ccc935146a4795e3990d30468d.jpg\",\n" +
            "                        \"orderNum\": 132\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3434008\",\n" +
            "                        \"name\": \"木天蓼逗猫棍\",\n" +
            "                        \"desc\": \"零食玩具，互动磨牙\",\n" +
            "                        \"price\": \"16.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/674ec7a88de58a026304983dd049ea69.jpg\",\n" +
            "                        \"orderNum\": 145\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109293000\",\n" +
            "                \"name\": \"家庭医疗\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/3f34039fa8c26e18e2f4fc96ed8cb6de.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3995913\",\n" +
            "                        \"name\": \"家庭常备红外线耳温式体温计\",\n" +
            "                        \"desc\": \"耳温式体温计测量更准确\",\n" +
            "                        \"price\": \"139.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/cb09d868c280608a29c1d131dbc08061.jpg\",\n" +
            "                        \"orderNum\": 161\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3988985\",\n" +
            "                        \"name\": \"医用级缓鼻塞，可调式鼻腔清洗器\",\n" +
            "                        \"desc\": \"医用级洗鼻器，深度清洁疏通鼻腔\",\n" +
            "                        \"price\": \"39.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/3cfb2027c8644fe4a29d4809f6a3ad7e.png\",\n" +
            "                        \"orderNum\": 146\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3997406\",\n" +
            "                        \"name\": \"支撑颈椎无负担，颈椎固定器\",\n" +
            "                        \"desc\": \"0.23KG轻量化设计，支撑颈椎，低头族救星\",\n" +
            "                        \"price\": \"299.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0cdfd546f8675669b87716114ad5900a.jpg\",\n" +
            "                        \"orderNum\": 169\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3997974\",\n" +
            "                        \"name\": \"入门首选，语音播报电子血压计\",\n" +
            "                        \"desc\": \"全程语音指导，一键测量，监测心率，贴心守护爸妈健康\",\n" +
            "                        \"price\": \"109.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/8f0c15f981c5cbcb1aa17215a259fa62.png\",\n" +
            "                        \"orderNum\": 181\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3987635\",\n" +
            "                        \"name\": \"语音播报，臂式测量血压计\",\n" +
            "                        \"desc\": \"臂式测量更准确，给爸妈的礼物\",\n" +
            "                        \"price\": \"219.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/a153def14233781de524ba184389855c.jpg\",\n" +
            "                        \"orderNum\": 102\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109308000\",\n" +
            "                \"name\": \"中医保健\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/2bfba997fd031317caecc4f0bad17569.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3993481\",\n" +
            "                        \"name\": \"带提手可站立炫彩硅胶热水袋\",\n" +
            "                        \"desc\": \"杯型式设计，轻松注水防烫伤\",\n" +
            "                        \"price\": \"35.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0b120e1c37f312981f4f2242997cc862.png\",\n" +
            "                        \"orderNum\": 254\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3995284\",\n" +
            "                        \"name\": \"新年佳礼，家用SPA多功能按摩床垫\",\n" +
            "                        \"desc\": \"坐卧两用，随时随地做spa，多个场合随你心意\",\n" +
            "                        \"price\": \"599.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/c41003c6df90d7673195dcc2482e13f3.jpg\",\n" +
            "                        \"orderNum\": 250\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3992367\",\n" +
            "                        \"name\": \"七夕礼物·挺拔身姿，隐形内穿矫姿带\",\n" +
            "                        \"desc\": \"众筹爆品回归，专注矫姿20年，轻松矫正身姿\",\n" +
            "                        \"price\": \"149.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/7d1bc78607a08c088b2a7cdbe88c05af.png\",\n" +
            "                        \"orderNum\": 218\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3991840\",\n" +
            "                        \"name\": \"消炎镇痛一贴灵医用冷敷贴60贴/盒\",\n" +
            "                        \"desc\": \"mini型尺寸设计性价比更高\",\n" +
            "                        \"price\": \"79.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/d3807695c7d42a0247e308a936201d7c.jpg\",\n" +
            "                        \"orderNum\": 182\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3986121\",\n" +
            "                        \"name\": \"艾灸理疗随时随地，灸疗装置8头/12头\",\n" +
            "                        \"desc\": \"哪里不适灸哪里，全身都可灸\",\n" +
            "                        \"price\": \"99.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/941abaee58a88cb104228fe2c4cfdeb1.png\",\n" +
            "                        \"orderNum\": 152\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";

    public static final String CATEGORY_1013001_JSON ="{\"result\": {\n" +
            "        \"id\": \"1013001\",\n" +
            "        \"name\": \"个护\",\n" +
            "        \"picture\": null,\n" +
            "        \"children\": [\n" +
            "            {\n" +
            "                \"id\": \"1009000\",\n" +
            "                \"name\": \"家庭清洁\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/718318c0d3b55d011fcb7c7c843902ce.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"1525018\",\n" +
            "                        \"name\": \"灰尘毛发静电吸附地板除尘干巾40片/包\",\n" +
            "                        \"desc\": \"干湿两用，静电除尘\",\n" +
            "                        \"price\": \"7.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/cf7584e037706a8df54fecfc6dfdd2af.jpg\",\n" +
            "                        \"orderNum\": 235\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1548001\",\n" +
            "                        \"name\": \"添加茂金属更强韧，金属色垃圾袋\",\n" +
            "                        \"desc\": \"3卷90只，茂金属添加，柔韧加倍\",\n" +
            "                        \"price\": \"8.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/251393c0d8db7b0b594ccf86f1e796d0.png\",\n" +
            "                        \"orderNum\": 221\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1589017\",\n" +
            "                        \"name\": \"分场景使用不污染，超细纤维抹布分类5件套\",\n" +
            "                        \"desc\": \"精细分工，洁净家居\",\n" +
            "                        \"price\": \"14.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/c520bba8209bae877158e8810d889aca.png\",\n" +
            "                        \"orderNum\": 178\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1540017\",\n" +
            "                        \"name\": \"随用随丢，懒人真爱地板清洁/除菌湿巾\",\n" +
            "                        \"desc\": \"材质加厚，耐磨珍珠纹\",\n" +
            "                        \"price\": \"8.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/4c8a1cf2b8e40c250870491307dde11f.jpg\",\n" +
            "                        \"orderNum\": 149\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1306017\",\n" +
            "                        \"name\": \"大容量干湿分类，脚踏缓降静音垃圾桶\",\n" +
            "                        \"desc\": \"一踩开合，解放双手\",\n" +
            "                        \"price\": \"89.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/1b322ed8c25f94f1fbf39ddb5fedeb47.jpg\",\n" +
            "                        \"orderNum\": 184\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"1020002\",\n" +
            "                \"name\": \"浴室用品\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/dfb6142de1bd2f59b251eb8f7c7ea2fb.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"1487013\",\n" +
            "                        \"name\": \"清洁除菌二合一，蓝泡泡马桶清洁剂50g*4\",\n" +
            "                        \"desc\": \"除味除菌，如厕好心情\",\n" +
            "                        \"price\": \"17.80\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/905febd7908697751fea257f23cb7fad.png\",\n" +
            "                        \"orderNum\": 121\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1451027\",\n" +
            "                        \"name\": \"净水花洒好搭档韩国花洒替换滤芯2只装\",\n" +
            "                        \"desc\": \"适配除氯花洒，效果肉眼可见\",\n" +
            "                        \"price\": \"49.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/4edf6d2172a7a56d840887b9bdf408a0.png\",\n" +
            "                        \"orderNum\": 133\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1486018\",\n" +
            "                        \"name\": \"5分钟99%除菌日本卫浴除菌除臭清洁剂380ml\",\n" +
            "                        \"desc\": \"卫浴除菌消臭，亲肤更健康\",\n" +
            "                        \"price\": \"19.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/9b07be29bfccefb536f787c2d66bc67f.jpg\",\n" +
            "                        \"orderNum\": 154\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1435017\",\n" +
            "                        \"name\": \"‘嗖’一下就通了日本管道毛发溶解剂\",\n" +
            "                        \"desc\": \"溶解管道毛发，疏通除味清洁\",\n" +
            "                        \"price\": \"29.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/55284fa1d8773b8897efa0b2284a8437.png\",\n" +
            "                        \"orderNum\": 129\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1389000\",\n" +
            "                        \"name\": \"净水看得见韩国负离子增压除氯花洒\",\n" +
            "                        \"desc\": \"三重过滤，增压节水新升级\",\n" +
            "                        \"price\": \"99.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/1d9b3326658f985835a330b1f81dbfe3.png\",\n" +
            "                        \"orderNum\": 107\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109243016\",\n" +
            "                \"name\": \"餐厨清洁\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/55d927e337c1f6d394359e99ef72a621.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"1494003\",\n" +
            "                        \"name\": \"强效去油不伤手日本橙油除油污泡沫400ml\",\n" +
            "                        \"desc\": \"强力除油污，萃取橙油精华\",\n" +
            "                        \"price\": \"29.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/a263180ad8c46865cf5e7ff9fa57b63f.png\",\n" +
            "                        \"orderNum\": 118\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1540016\",\n" +
            "                        \"name\": \"饭后一张远离老油污，厨房除油污清洁湿巾\",\n" +
            "                        \"desc\": \"性价比款，增加饱饱的清洁液，高效去油污\",\n" +
            "                        \"price\": \"8.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/6b02ad3065740730aaf20b4fbddfa769.png\",\n" +
            "                        \"orderNum\": 123\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1418015\",\n" +
            "                        \"name\": \"告别油腻解放双手，白色懒人抹布囤货装16卷\",\n" +
            "                        \"desc\": \"16卷800节，用完即扔，洗碗打扫不脏手\",\n" +
            "                        \"price\": \"109.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/d6cb861f6d112be2be4ee7c58745eb71.png\",\n" +
            "                        \"orderNum\": 73\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1076003\",\n" +
            "                        \"name\": \"可替换头，蜂窝海绵洗杯刷\",\n" +
            "                        \"desc\": \"好洗快干，刷头可更换\",\n" +
            "                        \"price\": \"9.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/b2a1f9e90f7e7a63227dc22ce52ea579.png\",\n" +
            "                        \"orderNum\": 160\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1031002\",\n" +
            "                        \"name\": \"一面百洁布一面多孔海绵，三层复合洗碗刷\",\n" +
            "                        \"desc\": \"起泡快，两面刷\",\n" +
            "                        \"price\": \"6.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/6341041a76886655228ea3afeee5553d.png\",\n" +
            "                        \"orderNum\": 96\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109256012\",\n" +
            "                \"name\": \"纸品\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/07fef43b0d14882d6662233ab30dc588.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"1418009\",\n" +
            "                        \"name\": \"27卷整箱装谷风一木升级4层卷纸180g\",\n" +
            "                        \"desc\": \"柔软细腻，融水即化无残余\",\n" +
            "                        \"price\": \"73.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/101969cddc3b433afae9cbef3dbfd341.jpg\",\n" +
            "                        \"orderNum\": 95\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1343000\",\n" +
            "                        \"name\": \"最不舍柔情似水的你！平台云音乐3层软抽6包\",\n" +
            "                        \"desc\": \"我的心意，跃然纸上\",\n" +
            "                        \"price\": \"17.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/c43370d1090d445913dcb69a34875a59.jpg\",\n" +
            "                        \"orderNum\": 79\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1513021\",\n" +
            "                        \"name\": \"湿水不易破臻护倍韧4层软抽纸巾6包/提\",\n" +
            "                        \"desc\": \"干湿两用柔韧并济\",\n" +
            "                        \"price\": \"29.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/78d56b565a01d241ccae8d38717d3a1e.png\",\n" +
            "                        \"orderNum\": 87\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1512026\",\n" +
            "                        \"name\": \"更韧更吸水臻护倍韧4层180克卷纸10卷/提\",\n" +
            "                        \"desc\": \"如厕亦有好心情\",\n" +
            "                        \"price\": \"79.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/d6fdcb18ab58f9a7694e31cc680db07e.png\",\n" +
            "                        \"orderNum\": 312\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1124015\",\n" +
            "                        \"name\": \"谷风一木4层印花手帕纸12包/条\",\n" +
            "                        \"desc\": \"小巧便携，一纸四层厚实耐用\",\n" +
            "                        \"price\": \"5.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/875da4443d6b6b328d6ce42a7ba9fdf0.jpg\",\n" +
            "                        \"orderNum\": 117\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109256013\",\n" +
            "                \"name\": \"干湿巾\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/985897ea31fdfc159e12696f4dbb4c13.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3465081\",\n" +
            "                        \"name\": \"清洁养护一片搞定皮革护理湿巾\",\n" +
            "                        \"desc\": \"一擦如新懒人必备\",\n" +
            "                        \"price\": \"9.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/bc32744cdf844b5136d3d84b0e6ba9d4.jpg\",\n" +
            "                        \"orderNum\": 89\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1554011\",\n" +
            "                        \"name\": \"不含酒精，使用安心爽肤清洁湿巾\",\n" +
            "                        \"desc\": \"清洁滋养，一步到位\",\n" +
            "                        \"price\": \"29.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/5e7864647286c7447eeee7f0025f8c11.png\",\n" +
            "                        \"orderNum\": 108\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1554013\",\n" +
            "                        \"name\": \"湿擦更干净，屁屁更舒爽可冲散湿厕纸\",\n" +
            "                        \"desc\": \"厕后洁净新体验，擦走细菌更安心\",\n" +
            "                        \"price\": \"3.50\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/167d480b612c6700020cda636f4efab3.png\",\n" +
            "                        \"orderNum\": 129\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3406047\",\n" +
            "                        \"name\": \"随用随撕多功能酒精消毒湿巾桶装/便携\",\n" +
            "                        \"desc\": \"酒精杀菌，擦出安心感\",\n" +
            "                        \"price\": \"9.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/bb04ed0d1f5a52720f681f55600b7253.jpg\",\n" +
            "                        \"orderNum\": 99\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1554014\",\n" +
            "                        \"name\": \"镜片手机屏幕通用酒精擦拭片\",\n" +
            "                        \"desc\": \"一物多用，快速清洁不留痕\",\n" +
            "                        \"price\": \"19.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0a388c49c2769e2bf32313b799f340c7.png\",\n" +
            "                        \"orderNum\": 87\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109261055\",\n" +
            "                \"name\": \"毛巾浴巾\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/949c5f8b077cf386ff9f1f18bec3408b.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3436033\",\n" +
            "                        \"name\": \"1件装【新疆棉】云珍·轻软旅行长绒棉方巾\",\n" +
            "                        \"desc\": \"轻巧无捻小方巾，旅行便携\",\n" +
            "                        \"price\": \"7.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/99c83709ca5f9fd5c5bb35d207ad7822.png\",\n" +
            "                        \"orderNum\": 150\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3987992\",\n" +
            "                        \"name\": \"【新疆棉】简约山形纹全棉提花毛巾\",\n" +
            "                        \"desc\": \"新疆长绒棉毛巾，吸水好颜值高\",\n" +
            "                        \"price\": \"18.50\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e0cea368f41da1587b3b7fc523f169d7.png\",\n" +
            "                        \"orderNum\": 184\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1436010\",\n" +
            "                        \"name\": \"囤货装云珍·轻软旅行长绒棉毛巾6条装\",\n" +
            "                        \"desc\": \"触碰云软，热销50万条\",\n" +
            "                        \"price\": \"139.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/f4ed2e5d7b268bb270bce9ce63122ec0.jpg\",\n" +
            "                        \"orderNum\": 17\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1129016\",\n" +
            "                        \"name\": \"【新疆棉】快速擦干，阿瓦提长绒棉毛巾\",\n" +
            "                        \"desc\": \"瞬间吸水，亲肤近0掉毛率\",\n" +
            "                        \"price\": \"16.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/2f4ff18d601494cb7805ee099ed8a50f.png\",\n" +
            "                        \"orderNum\": 218\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1009026\",\n" +
            "                        \"name\": \"【新疆棉】云珍·轻软长绒棉浴巾\",\n" +
            "                        \"desc\": \"云朵般轻软，至柔至软\",\n" +
            "                        \"price\": \"129.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/957d7a338fc0de044965cc279fce68b2.png\",\n" +
            "                        \"orderNum\": 127\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";

    public static final String CATEGORY_1011000_JSON ="{\"result\": {\n" +
            "        \"id\": \"1011000\",\n" +
            "        \"name\": \"母婴\",\n" +
            "        \"picture\": null,\n" +
            "        \"children\": [\n" +
            "            {\n" +
            "                \"id\": \"1020003\",\n" +
            "                \"name\": \"T恤/polo/衬衫\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/1f0089afcec911db7202fbcdae57d5f8.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4007498\",\n" +
            "                        \"name\": \"ins风小碎花泡泡袖衬110-160cm\",\n" +
            "                        \"desc\": \"全棉面料，高支高密底布，手感柔软舒适，贴身穿着亲肤透气；经典娃娃衫，泡泡袖设计，增添可爱蓬松感；后背全开门襟，方便穿脱。\",\n" +
            "                        \"price\": \"99.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/c07edde1047fa1bd0b795bed136c2bb2.jpg\",\n" +
            "                        \"orderNum\": 513\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4026178\",\n" +
            "                        \"name\": \"经典格子元素，男童格子纯棉衬衫\",\n" +
            "                        \"desc\": \"经典格子元素，侧边小贴袋装饰，5色可选\",\n" +
            "                        \"price\": \"89.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/22cba953b8239943c6db9cd0715bc2d2.jpg\",\n" +
            "                        \"orderNum\": 599\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4026450\",\n" +
            "                        \"name\": \"趣味小恐龙绣花，男童灯芯绒衬衫\",\n" +
            "                        \"desc\": \"趣味小恐龙绣花，满版老虎印花，5色可选\",\n" +
            "                        \"price\": \"89.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e68d406a58622a8d850de442aacfcf2e.jpg\",\n" +
            "                        \"orderNum\": 708\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4026198\",\n" +
            "                        \"name\": \"经典格子元素，男童加绒格子衬衫\",\n" +
            "                        \"desc\": \"经典格子元素，翻盖小贴袋装饰\",\n" +
            "                        \"price\": \"125.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/084f82c43a71bbc4d280fbb09a47a028.jpg\",\n" +
            "                        \"orderNum\": 2407\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4007887\",\n" +
            "                        \"name\": \"度假风儿童薄款空调短袖衬衫73-130cm\",\n" +
            "                        \"desc\": \"宽松短款版型，丝绸垂坠质感，多色可选\",\n" +
            "                        \"price\": \"79.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/d8940a450c2229541b5faa04b90bc090.jpg\",\n" +
            "                        \"orderNum\": 212\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"1037006\",\n" +
            "                \"name\": \"儿童鞋\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/7fd14a409302391da16970981cacd336.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3992495\",\n" +
            "                        \"name\": \"加绒更保暖，毛毛虫儿童运动鞋26码-35码\",\n" +
            "                        \"desc\": \"加厚紧密毛绒内里，温柔包裹双足\",\n" +
            "                        \"price\": \"108.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/cd7cbb6e172f2236e5f5714f050a15fb.jpg\",\n" +
            "                        \"orderNum\": 148\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3991463\",\n" +
            "                        \"name\": \"雨天不湿脚，儿童萌趣雨鞋20-36码\",\n" +
            "                        \"desc\": \"舒适防滑，雨天行走更安心\",\n" +
            "                        \"price\": \"79.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/37aa0c734b6a78c8152611c678da71ad.png\",\n" +
            "                        \"orderNum\": 127\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3989454\",\n" +
            "                        \"name\": \"舒适透气，毛毛虫儿童网眼运动鞋26-35码\",\n" +
            "                        \"desc\": \"透气网眼，陪你度过这个夏天\",\n" +
            "                        \"price\": \"129.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0542fae3d3587dbf07e040306073aa83.jpg\",\n" +
            "                        \"orderNum\": 105\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3989234\",\n" +
            "                        \"name\": \"恣意一夏，防碰撞鞋头网眼凉鞋22-26码\",\n" +
            "                        \"desc\": \"轻量随心动，不到1只鸡蛋重量\",\n" +
            "                        \"price\": \"139.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/b88092c77844dd8b6e2da001b4295d85.png\",\n" +
            "                        \"orderNum\": 180\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3871007\",\n" +
            "                        \"name\": \"雪地无忧，毛毛虫儿童加绒运动靴26-35码\",\n" +
            "                        \"desc\": \"加厚加绒内里，保暖舒适\",\n" +
            "                        \"price\": \"199.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/f7be3d710f88ba9c0e344f89fa67fedb.jpg\",\n" +
            "                        \"orderNum\": 109\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109243018\",\n" +
            "                \"name\": \"外套/套装\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/773a8777f66c286f97af6d74a27d7fe1.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3995206\",\n" +
            "                        \"name\": \"90%白鸭绒，儿童轻羽绒马甲73-130cm\",\n" +
            "                        \"desc\": \"儿童轻羽绒马甲，保暖常备单品\",\n" +
            "                        \"price\": \"99.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/f73b2672f87b2e336d206c56d4ea7d0f.png\",\n" +
            "                        \"orderNum\": 140\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3994471\",\n" +
            "                        \"name\": \"甜酷运动风，儿童卫衣运动套装73-130cm\",\n" +
            "                        \"desc\": \"轻松搭配，一套活力尽显\",\n" +
            "                        \"price\": \"179.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/767fc11b88b1e7b795319cd78c65f72f.png\",\n" +
            "                        \"orderNum\": 180\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3995192\",\n" +
            "                        \"name\": \"毛茸茸小熊出没，儿童羊羔绒背心73-90cm\",\n" +
            "                        \"desc\": \"连帽熊耳设计，萌化少女心\",\n" +
            "                        \"price\": \"79.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/cd4b840751ef4f7505c85004f0bebcb5.png\",\n" +
            "                        \"orderNum\": 157\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3995195\",\n" +
            "                        \"name\": \"毛茸茸暖意，儿童羊羔绒外套73-120cm\",\n" +
            "                        \"desc\": \"宽松版型，搭出休闲风格\",\n" +
            "                        \"price\": \"99.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/1661541f80bc9776e64125b7d586c9e6.jpg\",\n" +
            "                        \"orderNum\": 4\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3994908\",\n" +
            "                        \"name\": \"90%白鸭绒，儿童棒球领轻薄羽绒服73-140cm\",\n" +
            "                        \"desc\": \"儿童棒球轻羽绒外套，保暖常备单品\",\n" +
            "                        \"price\": \"159.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/6d8d6772df51fa60c2e899a16ac34718.png\",\n" +
            "                        \"orderNum\": 142\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109243019\",\n" +
            "                \"name\": \"裤子/裙装\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/a8c52cea5f953019484a74883ad8f14b.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4005108\",\n" +
            "                        \"name\": \"儿童亚麻夏凉宽松萝卜裤防蚊裤66-130cm\",\n" +
            "                        \"desc\": \"100%天然亚麻面料，凉爽舒适，透气不闷热\",\n" +
            "                        \"price\": \"95.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/2c61c7b96488f940904d697bdb401250.jpg\",\n" +
            "                        \"orderNum\": 180\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4005109\",\n" +
            "                        \"name\": \"条纹CHIC风，女童字母条纹连衣裙73-130cm\",\n" +
            "                        \"desc\": \"甄选100%纯棉面料，手感细腻柔软，穿着舒适透气。\",\n" +
            "                        \"price\": \"99.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/1f79f14fd666bda2be3d100e90ef6b37.jpg\",\n" +
            "                        \"orderNum\": 132\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4003104\",\n" +
            "                        \"name\": \"法式清新，长袖格纹连衣裙/衬衫110-160cm\",\n" +
            "                        \"desc\": \"复古色织小格纹，增添一份休闲时尚感\",\n" +
            "                        \"price\": \"129.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/48ad67400b3097d730ef0a5d6e7fb84a.png\",\n" +
            "                        \"orderNum\": 332\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3995844\",\n" +
            "                        \"name\": \"优质90%白鸭绒，儿童轻薄羽绒裤1-6岁\",\n" +
            "                        \"desc\": \"轻羽保暖，抵御寒冬\",\n" +
            "                        \"price\": \"129.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/f17d6260e7eb0cb805b796296f5f54b5.jpg\",\n" +
            "                        \"orderNum\": 190\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4005110\",\n" +
            "                        \"name\": \"人手必备，儿童轻薄透气防蚊裤73-140cm\",\n" +
            "                        \"desc\": \"天甄选优质面料，手感清凉柔软\",\n" +
            "                        \"price\": \"69.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/da7143e0103304f0f3230715003181ee.jpg\",\n" +
            "                        \"orderNum\": 132\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109243021\",\n" +
            "                \"name\": \"连体衣/礼盒\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/773677cc0922628152a9b3cbd862426f.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4007963\",\n" +
            "                        \"name\": \"新疆棉宝宝时尚涂鸦短袖连体衣59-90cm\",\n" +
            "                        \"desc\": \"创意手绘图案，透气纯棉面料，3色可选\",\n" +
            "                        \"price\": \"69.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/a8b170b3114d33dae0ae98cddb5fb3f6.jpg\",\n" +
            "                        \"orderNum\": 179\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4023745\",\n" +
            "                        \"name\": \"21秋季新品，棉毛布基础款哈衣59-90cm\",\n" +
            "                        \"desc\": \"全新印花，不一样的萌趣世界\",\n" +
            "                        \"price\": \"52.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/8f75c65cb650579df03b1997913949ff.jpg\",\n" +
            "                        \"orderNum\": 467\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4007970\",\n" +
            "                        \"name\": \"舒适条纹，纯棉凉爽无袖连体衣59-90cm\",\n" +
            "                        \"desc\": \"个性条纹元素，趣味小象图案，3色可选\",\n" +
            "                        \"price\": \"79.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/1457b3631892a975c8a8f6dbaabea8e8.jpg\",\n" +
            "                        \"orderNum\": 131\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4000277\",\n" +
            "                        \"name\": \"21春季新品，宝宝舒适四季连体衣0-3岁\",\n" +
            "                        \"desc\": \"拥抱新生，A类婴幼儿标准，安全放心\",\n" +
            "                        \"price\": \"79.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/6efe85e63ab1e09896e1c99a9fe09d9e.png\",\n" +
            "                        \"orderNum\": 200\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4023751\",\n" +
            "                        \"name\": \"释放可爱天性，棉毛布造型领哈衣59-90cm\",\n" +
            "                        \"desc\": \"A类婴幼儿标准，安全放心\",\n" +
            "                        \"price\": \"62.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/5e2b5629af983dadbceed483dd677eeb.jpg\",\n" +
            "                        \"orderNum\": 642\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109243022\",\n" +
            "                \"name\": \"学步鞋\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/9a50280bb69e1c12f557f601cce1c480.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4023738\",\n" +
            "                        \"name\": \"舒适软弹，糖果色儿童网孔透气运动鞋25-30\",\n" +
            "                        \"desc\": \"防踢鞋头，透气网孔更舒适\",\n" +
            "                        \"price\": \"139.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/c437179bc1d0d5ad77a79f15a5c6f166.png\",\n" +
            "                        \"orderNum\": 1034\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4027466\",\n" +
            "                        \"name\": \"儿童气泵软底学步二阶段学步鞋\",\n" +
            "                        \"desc\": \"气泵大底学步鞋\",\n" +
            "                        \"price\": \"239.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/19bedfd20a12842b5d7f7b909a62e877.jpg\",\n" +
            "                        \"orderNum\": 458\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4007784\",\n" +
            "                        \"name\": \"婴幼儿童透气网面学步鞋小童鞋4-6码\",\n" +
            "                        \"desc\": \"优质透气网布鞋面，轻盈自在\",\n" +
            "                        \"price\": \"119.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/a9f428091f172db89977a511f6639fec.jpg\",\n" +
            "                        \"orderNum\": 182\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3998535\",\n" +
            "                        \"name\": \"学步更自如，婴幼童机能学步鞋4-6码\",\n" +
            "                        \"desc\": \"宝宝的第一双鞋，成长不将就\",\n" +
            "                        \"price\": \"109.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/ef01de6dfac9cc4c548f317f2feddafe.jpg\",\n" +
            "                        \"orderNum\": 171\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4027473\",\n" +
            "                        \"name\": \"新款LOGO印花时尚学步叫叫鞋\",\n" +
            "                        \"desc\": \"软底包头叫叫鞋\",\n" +
            "                        \"price\": \"259.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/841d7669e6cc23cb249f47d8d39fc17c.jpg\",\n" +
            "                        \"orderNum\": 2338\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";

    public static final String CATEGORY_1043000_JSON ="{\"result\": {\n" +
            "        \"id\": \"1043000\",\n" +
            "        \"name\": \"数码\",\n" +
            "        \"picture\": null,\n" +
            "        \"children\": [\n" +
            "            {\n" +
            "                \"id\": \"1008006\",\n" +
            "                \"name\": \"影音娱乐\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/f5797ca77cfe413e7753ec69f9bd4bb1.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3989748\",\n" +
            "                        \"name\": \"善谋者得天下，三国杀桌游\",\n" +
            "                        \"desc\": \"宅家娱乐神器，竞技社交合一\",\n" +
            "                        \"price\": \"158.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/b4960b7e7d9dd98c83ec1ec350f4f39c.png\",\n" +
            "                        \"orderNum\": 96\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3990582\",\n" +
            "                        \"name\": \"airline真无线耳机，空气感佩戴，全新升级\",\n" +
            "                        \"desc\": \"音乐工匠打造，高保真音质\",\n" +
            "                        \"price\": \"189.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/48c839eed5b1559636b15cc9b86aa06c.jpg\",\n" +
            "                        \"orderNum\": 139\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3806013\",\n" +
            "                        \"name\": \"平台云音乐氧气立体声蓝牙头戴式触控耳机\",\n" +
            "                        \"desc\": \"智能红心键，一键交互云音乐app；高通蓝牙5.0强信号，aptX无损音质体验；26小时长续航；Hi-res专业高解析认证；极简滑触设计，柔软亲肤蛋白皮耳罩，佩戴舒适\",\n" +
            "                        \"price\": \"459.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/d8764ae4cca84f15628d4d13797fad6e.png\",\n" +
            "                        \"orderNum\": 127\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3990740\",\n" +
            "                        \"name\": \"发现隐藏角落的摄像头，多功能红外探测仪\",\n" +
            "                        \"desc\": \"红外探测声光报警小巧便携\",\n" +
            "                        \"price\": \"99.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/f04029bd97987a8fe796b2b3b41ef4dd.png\",\n" +
            "                        \"orderNum\": 123\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3842020\",\n" +
            "                        \"name\": \"平台云音乐真无线蓝牙耳机Lite版\",\n" +
            "                        \"desc\": \"蓝牙5.0低功耗20小时续航；三频均衡，干净音质；IPX5防水设计，纳米涂层；陶瓷天线，信号更强大\",\n" +
            "                        \"price\": \"179.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e3b8bf89ef7ba71c24c853927ec89ee8.png\",\n" +
            "                        \"orderNum\": 149\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"1022000\",\n" +
            "                \"name\": \"3C数码\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/99b8f97b2e5449606fd558574aa15982.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3487028\",\n" +
            "                        \"name\": \"罗永浩推荐款！平台智造轻薄无线充电器\",\n" +
            "                        \"desc\": \"苹果7.5W快充三星快充\",\n" +
            "                        \"price\": \"59.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/3f72b00417feb825694276224ff1d632.png\",\n" +
            "                        \"orderNum\": 105\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3486000\",\n" +
            "                        \"name\": \"平台有道口袋打印机GT1\",\n" +
            "                        \"desc\": \"便携打印，配热敏纸一卷\",\n" +
            "                        \"price\": \"179.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/5132df203926107422afc38bafe497fc.png\",\n" +
            "                        \"orderNum\": 129\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3464062\",\n" +
            "                        \"name\": \"办公居家必备，3A3U智能插线板\",\n" +
            "                        \"desc\": \"高颜值插线板，办公居家必备\",\n" +
            "                        \"price\": \"59.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/b9e65109ee77e9a78f57ce3fef97c793.png\",\n" +
            "                        \"orderNum\": 122\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3844032\",\n" +
            "                        \"name\": \"平台有道翻译王青春版\",\n" +
            "                        \"desc\": \"沟通无障碍，学习更轻松\",\n" +
            "                        \"price\": \"799.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0d8fe495fe82abbdf8826c4fd1e1e77b.png\",\n" +
            "                        \"orderNum\": 118\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1569014\",\n" +
            "                        \"name\": \"出差旅行必备神器，多国通用转换插头\",\n" +
            "                        \"desc\": \"新增PD45W电脑快充款，电脑、手机、ipad快充1个搞定。\",\n" +
            "                        \"price\": \"115.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/804d2ff16a809bc5055b90663456651a.jpg\",\n" +
            "                        \"orderNum\": 81\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"1028001\",\n" +
            "                \"name\": \"乐器\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/da0ac345e98c04594b697b56ebc373a5.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4033959\",\n" +
            "                        \"name\": \"3秒快速拆琴轻松保养odin奥丁12半音阶口琴\",\n" +
            "                        \"desc\": \"易吹性好按键灵敏音色优美全黑琴身\",\n" +
            "                        \"price\": \"329.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/937a8e46a9284e8f7e00e13911ecfbe7.png\",\n" +
            "                        \"orderNum\": 2331\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4034793\",\n" +
            "                        \"name\": \"跟灯按弦超好玩碳纤维智能尤克里里\",\n" +
            "                        \"desc\": \"指板亮灯，指引按弦。可视化学习，更高效！还有更多游戏闯关，超有乐趣，不知不觉学会弹琴。\",\n" +
            "                        \"price\": \"599.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/62107ce9769183757d9a425af9f503df.jpg\",\n" +
            "                        \"orderNum\": 424\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3993375\",\n" +
            "                        \"name\": \"云音乐定制IN系列intar民谣木吉他\",\n" +
            "                        \"desc\": \"云音乐2020in系列全新设计intar民谣木吉他\",\n" +
            "                        \"price\": \"625.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/4d825431a3587edb63cb165166f8fc76.jpg\",\n" +
            "                        \"orderNum\": 89\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109243035\",\n" +
            "                \"name\": \"手机配件\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/0276d68f4b7a03bbd16675ada6e707ff.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3533020\",\n" +
            "                        \"name\": \"iPhone13/12系列PD20W高速快充数据线\",\n" +
            "                        \"desc\": \"MFI官方认证，PD闪电快充\",\n" +
            "                        \"price\": \"59.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/34dc5a4e3ff49b8988c26d88724b9d6a.png\",\n" +
            "                        \"orderNum\": 131\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1484016\",\n" +
            "                        \"name\": \"新增iPhone13型号，编织纹手机壳\",\n" +
            "                        \"desc\": \"会呼吸的手机壳,iPhone13系列惊艳亮相\",\n" +
            "                        \"price\": \"11.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/5336b359d30b57c3266a325951b19aff.jpg\",\n" +
            "                        \"orderNum\": 144\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1480015\",\n" +
            "                        \"name\": \"双Type-C接口手机笔记本充电线（1米/2米）\",\n" +
            "                        \"desc\": \"2米加长，远程充电，差旅必备\",\n" +
            "                        \"price\": \"23.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/6e21780fd83f5a470e345286403983a6.jpg\",\n" +
            "                        \"orderNum\": 145\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1554052\",\n" +
            "                        \"name\": \"3D全屏高清iPhone手机钢化玻璃膜\",\n" +
            "                        \"desc\": \"进口材料，偏执工艺，玻璃潮流！\",\n" +
            "                        \"price\": \"59.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/16467db3236af1c2341bf7e5b40ac8a4.png\",\n" +
            "                        \"orderNum\": 98\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1193027\",\n" +
            "                        \"name\": \"MFI认证苹果快充数据线\",\n" +
            "                        \"desc\": \"xingpai智造苹果快充数据线（1米升级加固版）\",\n" +
            "                        \"price\": \"49.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/06d3a89ce18f0ae6360b9cd288084045.png\",\n" +
            "                        \"orderNum\": 111\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109243036\",\n" +
            "                \"name\": \"车载用品\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/3f45fbcdac7e8532b6a1570e6d7fe171.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3844041\",\n" +
            "                        \"name\": \"一吸即净，车家多用，车载无线吸尘器\",\n" +
            "                        \"desc\": \"5分钟搞定车内清洁\",\n" +
            "                        \"price\": \"199.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/02dcab8b641999d575a18546851e8013.png\",\n" +
            "                        \"orderNum\": 108\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3827027\",\n" +
            "                        \"name\": \"吸尘除菌除味黑科技英国摩飞无线吸尘器\",\n" +
            "                        \"desc\": \"强劲吸尘，臭氧杀菌除味，立体空间净化\",\n" +
            "                        \"price\": \"328.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/67a8a549b68c9f7fcd3709b54d8c4d29.png\",\n" +
            "                        \"orderNum\": 111\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3994432\",\n" +
            "                        \"name\": \"平台严选x敦煌博物馆鹿游仙踪植萃车载香氛\",\n" +
            "                        \"desc\": \"复古敦煌色系，植萃天然香氛，安全健康孕婴可用\",\n" +
            "                        \"price\": \"33.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/15db90ea8c8c7456c1fee4e18abb25da.png\",\n" +
            "                        \"orderNum\": 151\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3992720\",\n" +
            "                        \"name\": \"旅途手机好伴侣，三合一车载手机支架\",\n" +
            "                        \"desc\": \"带安全锤和应急割刀的手机支架\",\n" +
            "                        \"price\": \"49.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/2245a3d6898361236babb66d834e19c8.jpg\",\n" +
            "                        \"orderNum\": 89\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3440042\",\n" +
            "                        \"name\": \"超细纤维擦车厨房多用清洁抹布\",\n" +
            "                        \"desc\": \"超细纤维，清洁加倍不伤车身\",\n" +
            "                        \"price\": \"21.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0c0691b4ac8c491142d6a74750c5c606.jpg\",\n" +
            "                        \"orderNum\": 81\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109243046\",\n" +
            "                \"name\": \"办公文具\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/801583d2f58274b13dc6a03daed1c3c9.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3499024\",\n" +
            "                        \"name\": \"创意金属立体拼酷模型\",\n" +
            "                        \"desc\": \"凤舞龙翔呈现华丽视觉\",\n" +
            "                        \"price\": \"158.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/f3784ed01706f2f2722f12410a6429c9.png\",\n" +
            "                        \"orderNum\": 129\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3529022\",\n" +
            "                        \"name\": \"书源彩色按动中性笔\",\n" +
            "                        \"desc\": \"化繁为简，书写本源\",\n" +
            "                        \"price\": \"33.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/21216556e7d47a4e4277dcb36a16a486.png\",\n" +
            "                        \"orderNum\": 119\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3468024\",\n" +
            "                        \"name\": \"意外设计便携钢笔花信礼盒\",\n" +
            "                        \"desc\": \"生活的美，诗人的心\\n4.16-4.19号停止发货\",\n" +
            "                        \"price\": \"398.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/cc1c57b701f202bc585d8fff3b65571e.png\",\n" +
            "                        \"orderNum\": 140\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3506005\",\n" +
            "                        \"name\": \"意外设计小时光便携钢笔\",\n" +
            "                        \"desc\": \"精致与优雅随身藏\\n4.16-4.19号停止发货\",\n" +
            "                        \"price\": \"328.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/f3636b063dad944aa527e4652392a553.png\",\n" +
            "                        \"orderNum\": 129\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1512000\",\n" +
            "                        \"name\": \"用心记录每一句诗，飞鸟集钢笔本册文具礼盒\",\n" +
            "                        \"desc\": \"谱写情谊之歌\",\n" +
            "                        \"price\": \"89.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/3892e311f3494d2bcc2c1f8ed9e34271.png\",\n" +
            "                        \"orderNum\": 136\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";

    public static final String CATEGORY_1010000_JSON ="{\"result\": {\n" +
            "        \"id\": \"1010000\",\n" +
            "        \"name\": \"服饰\",\n" +
            "        \"picture\": null,\n" +
            "        \"children\": [\n" +
            "            {\n" +
            "                \"id\": \"109303000\",\n" +
            "                \"name\": \"钱包/胸包\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/237613bc9c22eb422dade63e3ed7c61a.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4013716\",\n" +
            "                        \"name\": \"别致优雅男式新潮头层牛皮钥匙包\",\n" +
            "                        \"desc\": \"可旋转五金挂钩，悬挂方便\",\n" +
            "                        \"price\": \"106.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/72f50e8d10cf3c6a040c2f800774b007.jpg\",\n" +
            "                        \"orderNum\": 259\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4019910\",\n" +
            "                        \"name\": \"一包在手想走就走男士风琴多卡位便携卡包\",\n" +
            "                        \"desc\": \"男士多卡位真皮卡包\",\n" +
            "                        \"price\": \"121.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/9af3d86efd10625817084dbecaf3d76c.jpg\",\n" +
            "                        \"orderNum\": 155\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4013563\",\n" +
            "                        \"name\": \"轻松出行复古经典老花时尚女式钥匙包\",\n" +
            "                        \"desc\": \"简约潮流女士钥匙包\",\n" +
            "                        \"price\": \"88.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/cedfb4827ca489e574abeb5d19ce21e5.jpg\",\n" +
            "                        \"orderNum\": 535\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4013557\",\n" +
            "                        \"name\": \"女式复古蜥蜴纹质感牛皮钱包\",\n" +
            "                        \"desc\": \"钱包+卡包+零钱包，三合一多功能设计\",\n" +
            "                        \"price\": \"104.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/230b28a65c33a719943ae5aa3a75e86a.jpg\",\n" +
            "                        \"orderNum\": 508\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4020262\",\n" +
            "                        \"name\": \"休闲潮流运动男士胸包\",\n" +
            "                        \"desc\": \"轻便休闲运动斜挎胸包\",\n" +
            "                        \"price\": \"136.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/fa3d10a78d37bbd3956ef5f8c855d1dc.jpg\",\n" +
            "                        \"orderNum\": 2035\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109311005\",\n" +
            "                \"name\": \"女式靴子\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/62c5dacf3e0cbe8e4188ccd263358d1a.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"1652031\",\n" +
            "                        \"name\": \"女式头层牛皮经典切尔西靴\",\n" +
            "                        \"desc\": \"经典挚爱，百搭的不老款\",\n" +
            "                        \"price\": \"275.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/a339fda444ac036855b75dcc4e66e37a.png\",\n" +
            "                        \"orderNum\": 163\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1667068\",\n" +
            "                        \"name\": \"新潮运动底，女式保暖皮毛一体雪地靴\",\n" +
            "                        \"desc\": \"澳洲羊皮毛一体，保暖舒适\",\n" +
            "                        \"price\": \"319.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/93efb5e64a554e98d2d11c0a322b08f6.png\",\n" +
            "                        \"orderNum\": 719\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1666023\",\n" +
            "                        \"name\": \"女式高弹金丝针织面金属跟短靴\",\n" +
            "                        \"desc\": \"金丝闪耀，如踏万千星辉\",\n" +
            "                        \"price\": \"259.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/b516518c0f7f1b608a04a8b8cbc9ef9d.png\",\n" +
            "                        \"orderNum\": 152\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3818015\",\n" +
            "                        \"name\": \"女式经典优雅尖头切尔西靴\",\n" +
            "                        \"desc\": \"尖头切尔西，穿上精致与优雅\",\n" +
            "                        \"price\": \"269.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e12d74857b6618dc4567398f32a71b0d.png\",\n" +
            "                        \"orderNum\": 93\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1651001\",\n" +
            "                        \"name\": \"女式圆头搭带牛皮踝靴\",\n" +
            "                        \"desc\": \"进口牛皮，舒适透气\",\n" +
            "                        \"price\": \"309.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/b7e41588d04c97bb3788e0fa2d402240.png\",\n" +
            "                        \"orderNum\": 122\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109311006\",\n" +
            "                \"name\": \"女式休闲鞋\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/8cd3a76ffffb14e9fe92ad2369117af0.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3991784\",\n" +
            "                        \"name\": \"复古经典女式休闲鞋小白鞋\",\n" +
            "                        \"desc\": \"超高性价比的真皮小白鞋\",\n" +
            "                        \"price\": \"172.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/ebf52f79b473b7839bcef1568975a179.png\",\n" +
            "                        \"orderNum\": 354\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3986614\",\n" +
            "                        \"name\": \"女式优雅蝴蝶结饰带浅口穆勒鞋\",\n" +
            "                        \"desc\": \"浪漫演绎，法式复古方头\",\n" +
            "                        \"price\": \"178.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/36cf7f601519a1c0f545d9e2a6123154.png\",\n" +
            "                        \"orderNum\": 115\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3827017\",\n" +
            "                        \"name\": \"鸣夏女式运动休闲凉鞋\",\n" +
            "                        \"desc\": \"凉鞋也有运动鞋的舒适度\",\n" +
            "                        \"price\": \"145.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/da7629edd21bebe5cd26adbbbf5817ac.png\",\n" +
            "                        \"orderNum\": 138\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3995432\",\n" +
            "                        \"name\": \"软牛皮少女系英伦鞋\",\n" +
            "                        \"desc\": \"轻盈舒适可软可硬才是女生应有的腔调\",\n" +
            "                        \"price\": \"236.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/eac6c40fdb0f977fdf80048d7b181ffa.png\",\n" +
            "                        \"orderNum\": 129\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3986520\",\n" +
            "                        \"name\": \"女式交叉绑带罗马角斗士凉鞋\",\n" +
            "                        \"desc\": \"夏日随性搭，时髦感飙升\",\n" +
            "                        \"price\": \"155.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/28dedcc7805456a1f8f79b7baf8c46aa.png\",\n" +
            "                        \"orderNum\": 111\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109311007\",\n" +
            "                \"name\": \"女式运动鞋\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/7be561f2ddc2179a7e116c413636eba9.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3996616\",\n" +
            "                        \"name\": \"保暖系列-女式饼干板鞋加毛款\",\n" +
            "                        \"desc\": \"简约纹理时尚“潮&#34;”你而来\",\n" +
            "                        \"price\": \"174.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/01f0260802ef8bba164e7c8e1ba8ae20.jpg\",\n" +
            "                        \"orderNum\": 148\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3997933\",\n" +
            "                        \"name\": \"复古阿甘女式休闲运动鞋\",\n" +
            "                        \"desc\": \"复古设计，时尚百搭，可穿四季\",\n" +
            "                        \"price\": \"258.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/839aea5622be52830fadd8ccdede4fec.png\",\n" +
            "                        \"orderNum\": 105\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4000582\",\n" +
            "                        \"name\": \"靓丽色彩，超软一脚蹬运动休闲女鞋\",\n" +
            "                        \"desc\": \"运动出游两不误，舒适百搭的一双好鞋\",\n" +
            "                        \"price\": \"220.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/4a64a5a54d588eaf5be48647b0ac83bd.png\",\n" +
            "                        \"orderNum\": 143\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3995021\",\n" +
            "                        \"name\": \"女式半透明夜光飞织运动鞋\",\n" +
            "                        \"desc\": \"潮流炫酷反光，仿似耀眼星光\",\n" +
            "                        \"price\": \"268.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/b101da9a1a4cbf1e934c34b41dc3cbc5.png\",\n" +
            "                        \"orderNum\": 176\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3995078\",\n" +
            "                        \"name\": \"厚底增高休闲运动老爹鞋\",\n" +
            "                        \"desc\": \"率性潮流马蹄底，悦享舒适\",\n" +
            "                        \"price\": \"286.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/9810d3acbd11e9dd77952eb97032b519.png\",\n" +
            "                        \"orderNum\": 168\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109315000\",\n" +
            "                \"name\": \"11.11购物狂欢\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/b29297263032957553d7153b309db74b.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4000620\",\n" +
            "                        \"name\": \"「一件三穿好过冬」男中长款鹅绒防水外套\",\n" +
            "                        \"desc\": \"一件衣服三种穿法，应对多变天气\",\n" +
            "                        \"price\": \"659.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/aa9e03278e3274a2a83f3f8e7df5ee6f.png\",\n" +
            "                        \"orderNum\": 200\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4000102\",\n" +
            "                        \"name\": \"男式零感无压加厚保暖羽绒服\",\n" +
            "                        \"desc\": \"为「轻暖」而生\",\n" +
            "                        \"price\": \"409.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0ff69c2099d98aa3cdddcb0edb9108a0.png\",\n" +
            "                        \"orderNum\": 132\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4001285\",\n" +
            "                        \"name\": \"英伦长柄自动晴雨伞\",\n" +
            "                        \"desc\": \"雨天有情调，英伦风设计，给你好品味\",\n" +
            "                        \"price\": \"40.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e77b8f4a8ddd1e777394d84347859f7c.png\",\n" +
            "                        \"orderNum\": 166\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4000914\",\n" +
            "                        \"name\": \"恍若没穿鞋，女式轻软舒弹健步鞋2.0\",\n" +
            "                        \"desc\": \"宛若没穿鞋的轻盈，体验更自由的奔跑\",\n" +
            "                        \"price\": \"159.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/feec7bde4d52521ae70ab4c5010ce992.png\",\n" +
            "                        \"orderNum\": 844\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4000422\",\n" +
            "                        \"name\": \"新国潮风严选原创蒸汽热敷眼罩（10片/盒）\",\n" +
            "                        \"desc\": \"国潮图案，当潮不让，为中国制造赋能\",\n" +
            "                        \"price\": \"31.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/f53da16cdc8180e43e483e867ef5e4db.png\",\n" +
            "                        \"orderNum\": 140\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109318003\",\n" +
            "                \"name\": \"【年末狂欢季】\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/8f8092d5bf6a133a8cb59ab7b9f790e9.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"1621018\",\n" +
            "                        \"name\": \"懒人瘦出好身材，多功能甩脂塑形机\",\n" +
            "                        \"desc\": \"懒人福音居家轻松塑身\",\n" +
            "                        \"price\": \"589.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/540f84174dbf9b98d4072abbd886819e.png\",\n" +
            "                        \"orderNum\": 412\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1555000\",\n" +
            "                        \"name\": \"舒眠真丝眼罩\",\n" +
            "                        \"desc\": \"顺滑真丝，感受舒适睡眠\",\n" +
            "                        \"price\": \"79.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/85432452d5f40c4798c08f1f0beb4a43.png\",\n" +
            "                        \"orderNum\": 171\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1593000\",\n" +
            "                        \"name\": \"软糯似baby肌肤，男式高领纯小山羊绒衫\",\n" +
            "                        \"desc\": \"绒毛取自未满1岁的山羊羊羔\",\n" +
            "                        \"price\": \"559.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/06156761337ba0fd1f8f51470f698b5f.png\",\n" +
            "                        \"orderNum\": 217\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1436033\",\n" +
            "                        \"name\": \"柔软透气，女式精梳棉内裤6条装\",\n" +
            "                        \"desc\": \"爱慕供应商柔软透气\",\n" +
            "                        \"price\": \"125.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/dc30e9603306e59d959e7fac6968244e.jpg\",\n" +
            "                        \"orderNum\": 206\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1281002\",\n" +
            "                        \"name\": \"轻灵碳素耐用型羽毛球拍单双拍\",\n" +
            "                        \"desc\": \"超轻球拍，运动随心\",\n" +
            "                        \"price\": \"119.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/89cc3ab3e332bb1df5dc20241b5ca4bb.png\",\n" +
            "                        \"orderNum\": 191\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";

    public static final String CATEGORY_1019000_JSON ="{\"result\": {\n" +
            "        \"id\": \"1019000\",\n" +
            "        \"name\": \"严选\",\n" +
            "        \"picture\": null,\n" +
            "        \"children\": [\n" +
            "            {\n" +
            "                \"id\": \"1065004\",\n" +
            "                \"name\": \"滋补保健\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/1e619a2b22f40bf83070e6f8f6e0c8ff.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3988969\",\n" +
            "                        \"name\": \"新西兰珍宝麦卢卡蜂蜜MGO250+活性因子250g\",\n" +
            "                        \"desc\": \"直升机才能到达的原始森林蜜源地\",\n" +
            "                        \"price\": \"169.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0de27b4a796b0385f9293e85a4b069d7.png\",\n" +
            "                        \"orderNum\": 238\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109256014\",\n" +
            "                \"name\": \"床品家纺\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/e6580910c1f98ed61bda867aeaf07929.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3991211\",\n" +
            "                        \"name\": \"奢享丝滑睡眠，儿童真丝蚕丝被\",\n" +
            "                        \"desc\": \"100%桑蚕丝被芯，舒滑真丝被套\",\n" +
            "                        \"price\": \"1480.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/d66e9010b01c33eee075ed66f0822c36.png\",\n" +
            "                        \"orderNum\": 151\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3828110\",\n" +
            "                        \"name\": \"泰国玻尿酸天然乳胶枕礼盒\",\n" +
            "                        \"desc\": \"泰国93%含量天然乳胶枕，玻尿酸天丝枕套\",\n" +
            "                        \"price\": \"205.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/a6890568768b97cae8e79b3d4391aab6.png\",\n" +
            "                        \"orderNum\": 148\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3829130\",\n" +
            "                        \"name\": \"偏爱低枕选它泰国93%含量天然乳胶面包枕\",\n" +
            "                        \"desc\": \"专为偏爱低枕人群设计\",\n" +
            "                        \"price\": \"139.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/92e403c01eca5a2e34c8299a43b1f2e3.jpg\",\n" +
            "                        \"orderNum\": 174\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1683030\",\n" +
            "                        \"name\": \"泰国进口乳胶，儿童抗菌防螨护颈乳胶枕\",\n" +
            "                        \"desc\": \"4-12岁专利草珊瑚枕套，抑菌防螨净享睡眠\",\n" +
            "                        \"price\": \"149.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/76f9d1e6667dfbb08ab04f1ab8e1db5a.jpg\",\n" +
            "                        \"orderNum\": 92\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3988150\",\n" +
            "                        \"name\": \"轻盈柔软如睡云端天然乳胶透气夏凉被\",\n" +
            "                        \"desc\": \"90%含量泰国乳胶，天然防螨，裸睡更舒适\",\n" +
            "                        \"price\": \"339.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/649f73ef1600e055794e0af90e31ab3d.png\",\n" +
            "                        \"orderNum\": 130\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109256015\",\n" +
            "                \"name\": \"锅具配件\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/50ccbf04857e86cccf44d25da0577deb.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4011740\",\n" +
            "                        \"name\": \"抑菌保鲜黑科技泰国可微波冷冻食物保鲜盒\",\n" +
            "                        \"desc\": \"玻璃黑科技耐热耐寒微生物屏障抑菌更保鲜\",\n" +
            "                        \"price\": \"16.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/5c00d2a3c9c5263b04f6c01a576dfa71.jpg\",\n" +
            "                        \"orderNum\": 177\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4023839\",\n" +
            "                        \"name\": \"日本冰块冰球制冰模具\",\n" +
            "                        \"desc\": \"轻轻一拍，轻松取冰\",\n" +
            "                        \"price\": \"29.80\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/2be38fc160992fe41f7d4a45bd0f90e5.png\",\n" +
            "                        \"orderNum\": 652\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3988148\",\n" +
            "                        \"name\": \"直接带盖进微波炉日本食物收纳保鲜盒\",\n" +
            "                        \"desc\": \"可冷藏可微波食品级树脂\",\n" +
            "                        \"price\": \"69.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/86c38b7caeb86dab0a5a5f0c8399ba32.png\",\n" +
            "                        \"orderNum\": 166\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3986195\",\n" +
            "                        \"name\": \"拯救整理强迫症密封防潮树脂收纳盒10件套\",\n" +
            "                        \"desc\": \"3对黑白大号加2对黑白小号\",\n" +
            "                        \"price\": \"115.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/6041e9bb949d80d491cf96c9d0ebcd4b.png\",\n" +
            "                        \"orderNum\": 130\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1667000\",\n" +
            "                        \"name\": \"调料收纳好帮手日本抽屉式厨房调味罐\",\n" +
            "                        \"desc\": \"可叠加设计，增加厨房储物空间\",\n" +
            "                        \"price\": \"39.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/74690da82db80d061ccfa2422a96c448.png\",\n" +
            "                        \"orderNum\": 82\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109275000\",\n" +
            "                \"name\": \"清洁用品\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/926d919bc3e95f5c93dc5dc973faa378.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3998109\",\n" +
            "                        \"name\": \"强力去垢不伤锅天然棕榈清洁刷长/短款\",\n" +
            "                        \"desc\": \"短柄针对顽渍，长柄清洁死角\",\n" +
            "                        \"price\": \"8.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/7537da93f26f0303d94c59f3889836ed.png\",\n" +
            "                        \"orderNum\": 93\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4010699\",\n" +
            "                        \"name\": \"除味净化神器Mootaa冰箱抑菌清洁剂250ml\",\n" +
            "                        \"desc\": \"除臭杀毒，持久保鲜，解决冰箱各种食材串味产生的难闻气味\",\n" +
            "                        \"price\": \"35.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/838c1b94f15e3b200bea21cef8989592.png\",\n" +
            "                        \"orderNum\": 281\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4027998\",\n" +
            "                        \"name\": \"亮碟多效合一洗涤块495g\",\n" +
            "                        \"desc\": \"洗碗机专用，强力去污\",\n" +
            "                        \"price\": \"69.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e07c2b63765cf9f4a46d489c6e09c1c1.jpg\",\n" +
            "                        \"orderNum\": 8\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4017718\",\n" +
            "                        \"name\": \"油污克星Mootaa重油污清洁剂\",\n" +
            "                        \"desc\": \"一喷快速溶解油污\",\n" +
            "                        \"price\": \"49.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/53a1579ead54c61a9b296d20c78a67ff.jpg\",\n" +
            "                        \"orderNum\": 510\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3990408\",\n" +
            "                        \"name\": \"1滴强力去污澳洲超浓缩不伤手洗洁精400ml\",\n" +
            "                        \"desc\": \"温和高效去污，一瓶可作多用\",\n" +
            "                        \"price\": \"17.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/9ffdc0b1f6dbbe2e9f10a187444c01a3.png\",\n" +
            "                        \"orderNum\": 141\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109309012\",\n" +
            "                \"name\": \"个护电器\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/7a0eea3c515ad247c092749bcdd29855.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4000009\",\n" +
            "                        \"name\": \"医美级冰脱韩国Ulike蓝宝石脉冲光脱毛仪\",\n" +
            "                        \"desc\": \"蓝宝石冰点脱毛，高效更持久\",\n" +
            "                        \"price\": \"1599.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/3567b2ac2526e6b89124f3fb62fd09d3.png\",\n" +
            "                        \"orderNum\": 204\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";

    public static final String CATEGORY_109243029_JSON ="{\"result\": {\n" +
            "        \"id\": \"109243029\",\n" +
            "        \"name\": \"运动\",\n" +
            "        \"picture\": null,\n" +
            "        \"children\": [\n" +
            "            {\n" +
            "                \"id\": \"109312000\",\n" +
            "                \"name\": \"健身大器械\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/6a1d37ffb2e28622a71e3c4415eaee35.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4019874\",\n" +
            "                        \"name\": \"麦瑞克家用轻音智能多功能彩屏跑步机S450\",\n" +
            "                        \"desc\": \"多功能跑步机，畅享彩屏\",\n" +
            "                        \"price\": \"2089.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/a5d745bbe067ca2468cdb2948f4f10ca.jpg\",\n" +
            "                        \"orderNum\": 702\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4018204\",\n" +
            "                        \"name\": \"麦瑞克家用轻音椭圆机（送上门包安装）\",\n" +
            "                        \"desc\": \"送上门包安装。高性价比，一机多用，全家可用\",\n" +
            "                        \"price\": \"1495.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/5e1d7dab26415cd0d44dfb9645e01348.jpg\",\n" +
            "                        \"orderNum\": 713\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4014017\",\n" +
            "                        \"name\": \"野小兽磁阻划船机健身器材家用室内运动训练\",\n" +
            "                        \"desc\": \"野小兽智能磁阻划船机，磁控静音，旋钮调阻，0.1m²占地，在线私教\",\n" +
            "                        \"price\": \"1499.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/43aa62df27f8f3f4fb6ba042ad21d830.png\",\n" +
            "                        \"orderNum\": 189\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4018446\",\n" +
            "                        \"name\": \"麦瑞克智能磁控轻音椭圆机\",\n" +
            "                        \"desc\": \"创新主体免安装，锻炼全身，纤腰细臀（HUAWEIHiLink生态）\",\n" +
            "                        \"price\": \"1899.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/c570b87e7f5f2ab77567e0f537eaee37.jpg\",\n" +
            "                        \"orderNum\": 225\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4011464\",\n" +
            "                        \"name\": \"麦瑞克折叠收纳进口白蜡木水阻划船机\",\n" +
            "                        \"desc\": \"体育·训练局国家队运动员备战保障产品,180°全折叠，占地小于0.5㎡，收放自如节省空间,8档旋钮精准调节阻力，智能APP数据监控\",\n" +
            "                        \"price\": \"2299.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/a71ac0318831f3d5f80d513d24ec1ac7.jpg\",\n" +
            "                        \"orderNum\": 155\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109312001\",\n" +
            "                \"name\": \"健身小器械\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/8c9f060e6fddb2b75af851a9a2c60087.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3995082\",\n" +
            "                        \"name\": \"朱炳仁铜·鼠标手救星，养生按摩保健铜球\",\n" +
            "                        \"desc\": \"东方智慧,抑菌材质,缓解鼠标手和颈椎不适,健体养生\",\n" +
            "                        \"price\": \"465.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/ac9670ade4c03ea79a654191ee2de8a2.png\",\n" +
            "                        \"orderNum\": 141\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3995478\",\n" +
            "                        \"name\": \"门上单杠墙体免打孔引体向上器\",\n" +
            "                        \"desc\": \"长度可调，墙体免打孔\",\n" +
            "                        \"price\": \"104.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/02b31c535488c3d41e074e4bbb7e8c46.jpg\",\n" +
            "                        \"orderNum\": 158\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3994144\",\n" +
            "                        \"name\": \"智能自动回弹健腹滚轮\",\n" +
            "                        \"desc\": \"智能回弹，卷腹神器，滚出好身材\",\n" +
            "                        \"price\": \"249.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/746948bc036104aeaae51e3c11e43729.png\",\n" +
            "                        \"orderNum\": 109\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3990777\",\n" +
            "                        \"name\": \"轻搏击主义-时尚拳击系列Pro\",\n" +
            "                        \"desc\": \"全新升级，一站式购齐，健身娱乐解压家庭必备\",\n" +
            "                        \"price\": \"171.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0f9a49918541de52bb644ede2cd27051.png\",\n" +
            "                        \"orderNum\": 111\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3991977\",\n" +
            "                        \"name\": \"家庭趣味拳击运动套装\",\n" +
            "                        \"desc\": \"拳击不倒翁球+手套，全家练习，趣味运动\",\n" +
            "                        \"price\": \"469.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e7ea387c419fc741c0eee3611093c23f.png\",\n" +
            "                        \"orderNum\": 118\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109312002\",\n" +
            "                \"name\": \"城市出行\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/b41b50710c3823f44a9f5b549a67ca81.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4026809\",\n" +
            "                        \"name\": \"亚洲头围城市运动通勤电动车头盔\",\n" +
            "                        \"desc\": \"亚洲头型设计3C认证城市通勤\",\n" +
            "                        \"price\": \"158.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/ae521f6d97560598f3e6b3ddaed477c0.png\",\n" +
            "                        \"orderNum\": 911\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4023114\",\n" +
            "                        \"name\": \"KJE金属色系轻量电动车骑行盔男女通用\",\n" +
            "                        \"desc\": \"3C认证，进口材料，安全出行\",\n" +
            "                        \"price\": \"120.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/8f3a3b7dc6ca874f934b15af31417f61.png\",\n" +
            "                        \"orderNum\": 3420\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4023115\",\n" +
            "                        \"name\": \"双镜四季骑行半盔Pro（摩托车可用）\",\n" +
            "                        \"desc\": \"3C认证，双镜片设计，进口材质耐撞抗摔\",\n" +
            "                        \"price\": \"198.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/7498e93c9744cce5dad8b556befe8c10.png\",\n" +
            "                        \"orderNum\": 359\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4013432\",\n" +
            "                        \"name\": \"KJE金属色系轻量电动车骑行盔男女通用\",\n" +
            "                        \"desc\": \"1、通过国家3C安全标准，安全有保证。\\n2、奥地利进口EPS，高密泡沫，有效缓冲外力，保护头部安全。\\n3、PC一体成型外壳，减轻重量的同时，使得外壳更加牢固，提高头盔使用寿命。\\n4、多彩金属亮面色系，让这款头盔更加年轻化，受众更广，接受度高。\\n5、高清镜片技术，能轻松挡下骑行过程中的异物。\\n6、精心设计的导风槽，可以使风从前后风孔流过带走热量，让人时刻保持清爽。\",\n" +
            "                        \"price\": \"129.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/09723c372699a2c5a92b2204d58bd61e.png\",\n" +
            "                        \"orderNum\": 142\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3997052\",\n" +
            "                        \"name\": \"靓丽出行马卡龙骑行头盔（春上新）\",\n" +
            "                        \"desc\": \"3C认证，进口材料，出行保暖\",\n" +
            "                        \"price\": \"108.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/1a546fb563a4c1b2af9b2839c31e8da2.png\",\n" +
            "                        \"orderNum\": 140\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109312003\",\n" +
            "                \"name\": \"运动护具\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/ef9bcb99d88b3a1cfd9d2e120c158c21.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3994931\",\n" +
            "                        \"name\": \"草本精华蒸汽热敷护颈带5片/盒\",\n" +
            "                        \"desc\": \"明星同款，给你的脖子做个SPA\",\n" +
            "                        \"price\": \"49.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/78a5e9ddfc577197899ac746b102bb2d.png\",\n" +
            "                        \"orderNum\": 199\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3995143\",\n" +
            "                        \"name\": \"透气运动训练护腕\",\n" +
            "                        \"desc\": \"缠绕贴合，稳固手腕\",\n" +
            "                        \"price\": \"39.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/2f1bdd73178dbe6b16b899c1bf23e3f4.png\",\n" +
            "                        \"orderNum\": 156\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3521201\",\n" +
            "                        \"name\": \"弹力支撑型护腰带\",\n" +
            "                        \"desc\": \"弹力支撑，专业护腰\",\n" +
            "                        \"price\": \"80.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e27676054de26f67acdff8a5efefbd25.jpg\",\n" +
            "                        \"orderNum\": 134\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3521212\",\n" +
            "                        \"name\": \"无缝针织高弹护膝\",\n" +
            "                        \"desc\": \"为膝而生，支撑减压\",\n" +
            "                        \"price\": \"42.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0864180b30b089da32e8d930071134fa.png\",\n" +
            "                        \"orderNum\": 122\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1687060\",\n" +
            "                        \"name\": \"关节膝盖酸痛石墨烯热敷护膝\",\n" +
            "                        \"desc\": \"高科技恒温发热，舒缓疼痛\",\n" +
            "                        \"price\": \"169.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e7a371380531c5e35c739e48d686fb73.png\",\n" +
            "                        \"orderNum\": 88\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109313000\",\n" +
            "                \"name\": \"垂钓\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/c4eeeae307d0562cf3e95303146282b2.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"4026116\",\n" +
            "                        \"name\": \"探险者黑胶防晒防雨遮阳伞户外钓鱼伞\",\n" +
            "                        \"desc\": \"防雨遮阳隔绝紫外线\",\n" +
            "                        \"price\": \"169.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/66090c5de391e43e4516601e14870842.jpg\",\n" +
            "                        \"orderNum\": 859\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4011360\",\n" +
            "                        \"name\": \"【明星单品】霸道轻量版大物竿钓竿鱼竿\",\n" +
            "                        \"desc\": \"三种调性一款轻硬无短板的综合竿\",\n" +
            "                        \"price\": \"251.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/7693195de927cc9fef8c468e33968cf5.jpg\",\n" +
            "                        \"orderNum\": 159\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"4008940\",\n" +
            "                        \"name\": \"佳钓尼伏魔典藏进口碳素钓鱼竿\",\n" +
            "                        \"desc\": \"伏魔典藏手杆，超轻超硬进口碳素鲤鱼鲫鱼杆\",\n" +
            "                        \"price\": \"305.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/3ea24817c9eb1fd692f2385ad6b7fb71.png\",\n" +
            "                        \"orderNum\": 653\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109313003\",\n" +
            "                \"name\": \"户外装备\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/6bbd92c68741c857d842f0afd1c7bdd5.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3993694\",\n" +
            "                        \"name\": \"可触屏户外出行手套-合集\",\n" +
            "                        \"desc\": \"户外轻松骑行\",\n" +
            "                        \"price\": \"89.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/264df9f0faddb60e88a8b108058d25e6.png\",\n" +
            "                        \"orderNum\": 137\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3994179\",\n" +
            "                        \"name\": \"运动健身跑步腰包\",\n" +
            "                        \"desc\": \"防水反光设计，大容量双口袋收纳，运动跑步更时尚\",\n" +
            "                        \"price\": \"40.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/610a693cfd6f01adc6923dc1c0ec91aa.jpg\",\n" +
            "                        \"orderNum\": 238\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3994572\",\n" +
            "                        \"name\": \"伊海诗冬日出行多功能防风保暖围脖\",\n" +
            "                        \"desc\": \"时尚针织印花面料，多种穿戴方式，正反两穿，亲肤保暖\",\n" +
            "                        \"price\": \"35.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/25effebb31ea6fc58b92f5a6aecda8b9.png\",\n" +
            "                        \"orderNum\": 237\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3988016\",\n" +
            "                        \"name\": \"户外快干轻巧遮阳帽\",\n" +
            "                        \"desc\": \"有效遮阳，可折叠收纳\",\n" +
            "                        \"price\": \"44.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/310eac832a1d90fbea41c4e6a9e604e4.png\",\n" +
            "                        \"orderNum\": 112\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3996603\",\n" +
            "                        \"name\": \"飞宇出游拍摄防抖神器手机稳定器\",\n" +
            "                        \"desc\": \"小巧便携，三轴防抖，模式随心选\",\n" +
            "                        \"price\": \"439.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/2d0a47a51fa4b3e3857f2010bd83bead.jpg\",\n" +
            "                        \"orderNum\": 125\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";

    public static final String CATEGORY_1005002_JSON ="{\"result\": {\n" +
            "        \"id\": \"1005002\",\n" +
            "        \"name\": \"美食\",\n" +
            "        \"picture\": null,\n" +
            "        \"children\": [\n" +
            "            {\n" +
            "                \"id\": \"1005012\",\n" +
            "                \"name\": \"南北干货\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/9af51a1090fd32f668b14451f06d6e72.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"1189004\",\n" +
            "                        \"name\": \"竹荪25克\",\n" +
            "                        \"desc\": \"菌中皇后，汤品添鲜\",\n" +
            "                        \"price\": \"28.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/c74e739833078c887a7d275c1caf81b5.png\",\n" +
            "                        \"orderNum\": 153\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1189007\",\n" +
            "                        \"name\": \"无芯软糯的萌妹子，建宁莲子228克\",\n" +
            "                        \"desc\": \"建莲佳品，稍炖即糯\",\n" +
            "                        \"price\": \"45.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0e43fa53f61ddf37926fad3b7a3c2688.jpg\",\n" +
            "                        \"orderNum\": 163\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1189003\",\n" +
            "                        \"name\": \"古田糯耳150克\",\n" +
            "                        \"desc\": \"加热易糯，一煮即稠\",\n" +
            "                        \"price\": \"26.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e8534f5e88af5aa5366786998c84543f.png\",\n" +
            "                        \"orderNum\": 126\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1189005\",\n" +
            "                        \"name\": \"楼兰灰枣328克\",\n" +
            "                        \"desc\": \"肉实质脆，枣香浓郁\",\n" +
            "                        \"price\": \"26.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/63aedbfedf9423b2b3109ee0e04b9dc4.png\",\n" +
            "                        \"orderNum\": 209\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1188006\",\n" +
            "                        \"name\": \"原产兰州，气清味美，甜百合干168克\",\n" +
            "                        \"desc\": \"干嚼清甜，一煮即糯\",\n" +
            "                        \"price\": \"42.80\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/b0b1556219d1445ba2818c5bf1bdc6af.png\",\n" +
            "                        \"orderNum\": 193\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"1036003\",\n" +
            "                \"name\": \"调味酱菜\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/5fae33a840870b487cc903535383bf97.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3419049\",\n" +
            "                        \"name\": \"下饭神器酸豆角50克*10袋\",\n" +
            "                        \"desc\": \"180天土窖腌制，酸爽脆嫩\",\n" +
            "                        \"price\": \"16.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/b7808ed03474fa33626571cdbd7f0ae6.jpg\",\n" +
            "                        \"orderNum\": 139\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3388018\",\n" +
            "                        \"name\": \"组合装牛油300克+清油110克*2+番茄110克*2\",\n" +
            "                        \"desc\": \"川渝火锅魂，地道重庆味\",\n" +
            "                        \"price\": \"32.80\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e0c1ffa060d1fd8b81a720212d684945.png\",\n" +
            "                        \"orderNum\": 134\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1545002\",\n" +
            "                        \"name\": \"三分钟即享简餐，日式即食咖喱150克\",\n" +
            "                        \"desc\": \"日式风味，甘香醇厚\",\n" +
            "                        \"price\": \"15.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/3a3d282779030c70e67dc0825ede50d3.png\",\n" +
            "                        \"orderNum\": 125\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3409008\",\n" +
            "                        \"name\": \"从江香猪油辣椒218克\",\n" +
            "                        \"desc\": \"油润爽辣，苗家手作\",\n" +
            "                        \"price\": \"28.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e06457f58b2cec3578c539c7b3cbfebe.png\",\n" +
            "                        \"orderNum\": 152\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1548007\",\n" +
            "                        \"name\": \"川味牛肉辣椒酱190克\",\n" +
            "                        \"desc\": \"辣香麻爽，地道川渝风味\",\n" +
            "                        \"price\": \"38.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/0e1681ab3a4a5aaf185f0bb123f07f99.jpg\",\n" +
            "                        \"orderNum\": 186\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109201001\",\n" +
            "                \"name\": \"方便食品\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/f9872b4aad6c0a943d45629ac96ee8d3.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"1691024\",\n" +
            "                        \"name\": \"地道卤香好味道，桂林鲜米粉245克*6盒\",\n" +
            "                        \"desc\": \"无人工添加防腐剂，鲜嫩爽滑\",\n" +
            "                        \"price\": \"69.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/26d71d6eb4c00ed727ad9f54ae4ce553.png\",\n" +
            "                        \"orderNum\": 83\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3452050\",\n" +
            "                        \"name\": \"冻干藤椒牛肉面70克*12盒\",\n" +
            "                        \"desc\": \"椒麻爽辣，面弹肉香，地道川味\",\n" +
            "                        \"price\": \"79.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/8821731cd2743ae4932f16e71feeecfa.png\",\n" +
            "                        \"orderNum\": 147\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3464033\",\n" +
            "                        \"name\": \"冻干藤椒豚骨面74克*12盒\",\n" +
            "                        \"desc\": \"日式风味，汤浓肉鲜，椒麻过瘾\",\n" +
            "                        \"price\": \"79.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/7a5ffe313fe5671709d5a9826f5a83a2.jpg\",\n" +
            "                        \"orderNum\": 164\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1690022\",\n" +
            "                        \"name\": \"现泡免煮，螺蛳粉370克*6盒\",\n" +
            "                        \"desc\": \"柳州味道，酸爽香臭\",\n" +
            "                        \"price\": \"78.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/65256152984021cfb766c4856f2307d8.jpg\",\n" +
            "                        \"orderNum\": 226\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1293000\",\n" +
            "                        \"name\": \"北海道风味大虾面61克*6杯\",\n" +
            "                        \"desc\": \"看得见的大只虾仁，吃得到的日式风味\",\n" +
            "                        \"price\": \"39.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/53992e4eb8ec385406038bf307e42ef7.jpg\",\n" +
            "                        \"orderNum\": 135\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109206007\",\n" +
            "                \"name\": \"米面粮油\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/8578759aed2268f7aa8641273cac7cb3.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"1269010\",\n" +
            "                        \"name\": \"什锦素食粥米500克\",\n" +
            "                        \"desc\": \"谷香米糯，营养美味\",\n" +
            "                        \"price\": \"9.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/dc4826ddb838d8e17f90402adfa3f4fe.png\",\n" +
            "                        \"orderNum\": 108\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1270008\",\n" +
            "                        \"name\": \"黄金玉粟粥米500克\",\n" +
            "                        \"desc\": \"谷物缤纷，香甜软糯\",\n" +
            "                        \"price\": \"9.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/5f62c7ab543b1152383a0e9941c09bfd.png\",\n" +
            "                        \"orderNum\": 374\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1135080\",\n" +
            "                        \"name\": \"加量50%不加价，贵州兴仁薏仁米600克\",\n" +
            "                        \"desc\": \"粒粒饱满，颗颗香糯\",\n" +
            "                        \"price\": \"19.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/3e93790bba8db8aab54ee5ba72799567.png\",\n" +
            "                        \"orderNum\": 96\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1135079\",\n" +
            "                        \"name\": \"免浸泡，12种谷物一次同享，五谷米400克\",\n" +
            "                        \"desc\": \"无需浸泡，同煮同熟\",\n" +
            "                        \"price\": \"9.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/bfe70bd66efe94f2f18061c707d2a097.png\",\n" +
            "                        \"orderNum\": 98\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1135075\",\n" +
            "                        \"name\": \"来自东北的“黑珍珠”，黑米470克*3袋\",\n" +
            "                        \"desc\": \"米汁香稠，Q弹醇香\",\n" +
            "                        \"price\": \"42.80\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/1452cfeb14b5d252fb1ba97b278e9cc3.png\",\n" +
            "                        \"orderNum\": 121\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109264007\",\n" +
            "                \"name\": \"名酒馆\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/91413b1476a0697bb0592609a42d4498.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3995885\",\n" +
            "                        \"name\": \"飞天53%vol500ml贵州茅台酒（带杯）\",\n" +
            "                        \"desc\": \"茅台飘香，正品溯源\",\n" +
            "                        \"price\": \"1499.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/d46e005025a5d3b73c4781d31b327558.jpg\",\n" +
            "                        \"orderNum\": 559\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3997547\",\n" +
            "                        \"name\": \"泸州老窖特曲浓香型白酒\",\n" +
            "                        \"desc\": \"非遗工艺制作，历经24代传承，至今690余年\",\n" +
            "                        \"price\": \"280.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/4f67876d44c4c0e318153c02cdfc701f.png\",\n" +
            "                        \"orderNum\": 266\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3998106\",\n" +
            "                        \"name\": \"德国莫泽尔传统版雷司令干白2019750ml\",\n" +
            "                        \"desc\": \"来自摩泽尔传奇名庄\",\n" +
            "                        \"price\": \"138.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/bcb8efeee3977d417b961c1eba4584a5.jpg\",\n" +
            "                        \"orderNum\": 251\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3399000\",\n" +
            "                        \"name\": \"玛歌正牌干红750毫升2017年\",\n" +
            "                        \"desc\": \"波尔多五大名庄玛歌正牌\",\n" +
            "                        \"price\": \"6699.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/9e915c0a8839fa72b6ee1f9600289b62.png\",\n" +
            "                        \"orderNum\": 144\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"3494006\",\n" +
            "                        \"name\": \"梅乃宿梅酒720毫升\",\n" +
            "                        \"desc\": \"小藏手工酿造，百年名酒\",\n" +
            "                        \"price\": \"168.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/330913911087b44b0d817dd78233165f.png\",\n" +
            "                        \"orderNum\": 276\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"109285003\",\n" +
            "                \"name\": \"进口酒\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/bf705060f01b60fe9c11c345931b1891.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"3407009\",\n" +
            "                        \"name\": \"苏格兰陈年单一麦芽威士忌700毫升\",\n" +
            "                        \"desc\": \"蒸馏大师监制\",\n" +
            "                        \"price\": \"318.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/a0a334a93e3d2bba7592ac692e045a48.png\",\n" +
            "                        \"orderNum\": 123\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1505052\",\n" +
            "                        \"name\": \"百年名庄出品，法国南部干红750毫升\",\n" +
            "                        \"desc\": \"法国原产，原瓶进口\",\n" +
            "                        \"price\": \"58.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/d27c759b53d5aea5145c68eb96765df8.png\",\n" +
            "                        \"orderNum\": 100\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1471002\",\n" +
            "                        \"name\": \"列级名庄出品，法国普罗旺斯桃红750毫升\",\n" +
            "                        \"desc\": \"普罗旺斯列级酒庄，优雅精致\",\n" +
            "                        \"price\": \"118.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/bc033185ab24f5e541e77b198adee609.jpg\",\n" +
            "                        \"orderNum\": 101\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1666009\",\n" +
            "                        \"name\": \"多米尼加陈年朗姆酒700毫升\",\n" +
            "                        \"desc\": \"陈年朗姆，香味芬芳\",\n" +
            "                        \"price\": \"238.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/e3f387109491d92c47179d029d340b1f.jpg\",\n" +
            "                        \"orderNum\": 203\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1425007\",\n" +
            "                        \"name\": \"名庄金奖加身，西班牙珍藏干红750毫升\",\n" +
            "                        \"desc\": \"产区名庄，囊获大奖\",\n" +
            "                        \"price\": \"168.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/ab17be62ad1262087b557139d5fc5b94.png\",\n" +
            "                        \"orderNum\": 118\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";

    public static final String CATEGORY_19999999_JSON ="{\"result\": {\n" +
            "        \"id\": \"19999999\",\n" +
            "        \"name\": \"杂项\",\n" +
            "        \"picture\": null,\n" +
            "        \"children\": [\n" +
            "            {\n" +
            "                \"id\": \"19999999001\",\n" +
            "                \"name\": \"家庭清洁杂项\",\n" +
            "                \"picture\": \"https://yanxuan.nosdn.127.net/718318c0d3b55d011fcb7c7c843902ce.png\",\n" +
            "                \"parentId\": null,\n" +
            "                \"parentName\": null,\n" +
            "                \"goods\": [\n" +
            "                    {\n" +
            "                        \"id\": \"1525018\",\n" +
            "                        \"name\": \"灰尘毛发静电吸附地板除尘干巾40片/包\",\n" +
            "                        \"desc\": \"干湿两用，静电除尘\",\n" +
            "                        \"price\": \"7.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/cf7584e037706a8df54fecfc6dfdd2af.jpg\",\n" +
            "                        \"orderNum\": 235\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1548001\",\n" +
            "                        \"name\": \"添加茂金属更强韧，金属色垃圾袋\",\n" +
            "                        \"desc\": \"3卷90只，茂金属添加，柔韧加倍\",\n" +
            "                        \"price\": \"8.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/251393c0d8db7b0b594ccf86f1e796d0.png\",\n" +
            "                        \"orderNum\": 221\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1589017\",\n" +
            "                        \"name\": \"分场景使用不污染，超细纤维抹布分类5件套\",\n" +
            "                        \"desc\": \"精细分工，洁净家居\",\n" +
            "                        \"price\": \"14.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/c520bba8209bae877158e8810d889aca.png\",\n" +
            "                        \"orderNum\": 178\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1540017\",\n" +
            "                        \"name\": \"随用随丢，懒人真爱地板清洁/除菌湿巾\",\n" +
            "                        \"desc\": \"材质加厚，耐磨珍珠纹\",\n" +
            "                        \"price\": \"8.90\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/4c8a1cf2b8e40c250870491307dde11f.jpg\",\n" +
            "                        \"orderNum\": 149\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"1306017\",\n" +
            "                        \"name\": \"大容量干湿分类，脚踏缓降静音垃圾桶\",\n" +
            "                        \"desc\": \"一踩开合，解放双手\",\n" +
            "                        \"price\": \"89.00\",\n" +
            "                        \"picture\": \"https://yanxuan-item.nosdn.127.net/1b322ed8c25f94f1fbf39ddb5fedeb47.jpg\",\n" +
            "                        \"orderNum\": 184\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"categories\": null,\n" +
            "                \"brands\": null,\n" +
            "                \"saleProperties\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";
}
