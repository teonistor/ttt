package io.github.teonistor.adventofcode

class _20Test extends AdventOfCodeTestBase {
  testAndRun(20, _20._1, _20._2,
    "Tile 2311:\n..##.#..#.\n##..#.....\n#...##..#.\n####.#...#\n##.##.###.\n##...#.###\n.#.#.#..##\n..#....#..\n###...#.#.\n..###..###\n\nTile 1951:\n#.##...##.\n#.####...#\n.....#..##\n#...######\n.##.#....#\n.###.#####\n###.##.##.\n.###....#.\n..#.#..#.#\n#...##.#..\n\nTile 1171:\n####...##.\n#..##.#..#\n##.#..#.#.\n.###.####.\n..###.####\n.##....##.\n.#...####.\n#.##.####.\n####..#...\n.....##...\n\nTile 1427:\n###.##.#..\n.#..#.##..\n.#.##.#..#\n#.#.#.##.#\n....#...##\n...##..##.\n...#.#####\n.#.####.#.\n..#..###.#\n..##.#..#.\n\nTile 1489:\n##.#.#....\n..##...#..\n.##..##...\n..#...#...\n#####...#.\n#..#.#.#.#\n...#.#.#..\n##.#...##.\n..##.##.##\n###.##.#..\n\nTile 2473:\n#....####.\n#..#.##...\n#.##..#...\n######.#.#\n.#...#.#.#\n.#########\n.###.#..#.\n########.#\n##...##.#.\n..###.#.#.\n\nTile 2971:\n..#.#....#\n#...###...\n#.#.###...\n##.##..#..\n.#####..##\n.#..####.#\n#..#.#..#.\n..####.###\n..#.#.###.\n...#.#.#.#\n\nTile 2729:\n...#.#.#.#\n####.#....\n..#.#.....\n....#..#.#\n.##..##.#.\n.#.####...\n####.#.#..\n##.####...\n##..#.##..\n#.##...##.\n\nTile 3079:\n#.#.#####.\n.#..######\n..#.......\n######....\n####.#..#.\n.#...#.##.\n#.#####.##\n..#.###...\n..#.......\n..#.###...",
    1951L * 3079L * 2971L * 1171L,
    273,
    "Tile 1913:\n##..#....#\n.#.#.#.###\n#...##.##.\n.....#.#.#\n.#......##\n.........#\n#...###..#\n.#..#.....\n.##...#..#\n#.#...#...\n\nTile 2579:\n##...####.\n##..#....#\n...#...#.#\n#.....###.\n##..#...##\n#....#..#.\n.#.....###\n.##...#...\n#.........\n...##.....\n\nTile 1531:\n.......###\n.#....####\n.#.#.#...#\n....#..#.#\n.#.#.##..#\n.#.#.#...#\n#.##...###\n##..#.....\n#...#.....\n##.##.#..#\n\nTile 1493:\n#.##.#.#..\n#.#..#.##.\n..#.....#.\n#.#.#....#\n....#....#\n...#####..\n#####.#.#.\n#.##..##..\n..#.....##\n.##..#.###\n\nTile 3109:\n########.#\n......#.##\n#....#...#\n##.#.##...\n....#.#...\n#####...##\n....#....#\n..##...###\n.......#.#\n#.##.#....\n\nTile 3343:\n###......#\n#..#.#..##\n...#....#.\n#.........\n..#.....##\n.....#####\n.....####.\n##.......#\n..#.......\n#.......##\n\nTile 2609:\n####..#.##\n#.#..#....\n....###..#\n###..#..#.\n#.#......#\n##..#..#..\n#....#..#.\n#......###\n#..#....##\n.#..#.###.\n\nTile 1823:\n###..#....\n..###...#.\n..#.###...\n...#.....#\n#....#.#.#\n.#..#.#..#\n#..##.#..#\n...##.....\n....#.#.#.\n###.##...#\n\nTile 3391:\n....#...#.\n.#.#....#.\n#......#..\n#..#....#.\n#.##...#.#\n...##.####\n....##..#.\n##.#.#..##\n.....#..##\n#.#.#..#.#\n\nTile 2753:\n....###..#\n.#..##.#.#\n...#......\n..#.###.##\n...#..##..\n....#.....\n#......#..\n#........#\n......#..#\n#..#.#...#\n\nTile 3989:\n.#.###.#..\n#......##.\n.##......#\n.......###\n###....###\n##........\n##....#.#.\n...#.#..#.\n........#.\n###..#..#.\n\nTile 1877:\n...###...#\n#.#..##...\n.##.###.#.\n#.#....#..\n#..#.#.##.\n#.......##\n####..#.#.\n##.#....##\n.##.......\n.#..##..##\n\nTile 2729:\n#...####.#\n...#.....#\n.###......\n...#..#..#\n...#.#.#.#\n.#.....##.\n..#.....##\n........#.\n###.......\n#..##...##\n\nTile 1031:\n##.#..####\n#.##.#....\n..#.......\n#......###\n.##.###.##\n#...#...#.\n#..##.....\n#..#.#.#..\n....###...\n....#.###.\n\nTile 3803:\n#..#..##..\n...##..#..\n...#.#....\n#.....#..#\n#........#\n.#..#.#.##\n..#..#.#..\n#..#.#.#..\n..##..#.#.\n#####.###.\n\nTile 3541:\n.##.#..#..\n.##..#...#\n.#.#..#...\n...#..##.#\n..#.....#.\n..##......\n.##......#\n##.......#\n.#..#.##.#\n###.#.##.#\n\nTile 3821:\n.#.#.#....\n..#..##...\n#.##......\n..#...#.##\n#.####..#.\n##.##.#...\n..#..#....\n....#....#\n...###.#.#\n.#..#.#.##\n\nTile 3853:\n#####..#.#\n.....#..##\n#...#.##.#\n.##....#.#\n#.#......#\n###...#.#.\n##....#.##\n#.#.#.#..#\n....###...\n##.#.#....\n\nTile 1249:\n###...####\n..#....#..\n##.##....#\n.........#\n#.........\n.##.#.##..\n...#...##.\n..........\n##...#.#..\n##.####..#\n\nTile 3673:\n...##..#.#\n.#..#..#.#\n###......#\n#.....###.\n..#.#.....\n#.#..#.###\n.#.##.##..\n.##....#..\n.#...##..#\n#.###..#.#\n\nTile 3163:\n##.#.#####\n.##....#..\n####......\n#..#.#..##\n.#.#..##.#\n##.....#.#\n.......#..\n#...#.....\n..#..#....\n###.#...#.\n\nTile 1759:\n###.#...##\n...#..#...\n###..###..\n.#.#...#.#\n.##...#...\n..###....#\n#.#.....#.\n......###.\n..#.####.#\n##..##..#.\n\nTile 1831:\n.#...#...#\n...#.#..##\n#...#.#...\n#...##.#..\n.#.#.#..#.\n......##.#\n.........#\n#....##.#.\n......#..#\n#..#...##.\n\nTile 2179:\n.###.....#\n..######.#\n....#....#\n...#....#.\n#.##..#...\n#..#....##\n.#..#.#..#\n..#.#....#\n#.#.#.....\n###.##...#\n\nTile 2713:\n..###.#..#\n#.#.....#.\n#....#.#..\n#...##....\n##...#.#.#\n###..###.#\n.##..#..##\n.#...##.#.\n#.#.......\n#...#.....\n\nTile 1889:\n....#....#\n......#.#.\n##.###...#\n.#..##...#\n##.##.#..#\n...#...##.\n#....#...#\n.......#..\n.#...#..##\n.#.####.##\n\nTile 1999:\n##....##.#\n#..#.##.##\n..#...#...\n#.....#...\n......#...\n#.....#..#\n.#.##..#.#\n..#..##..#\n#...#..#..\n###..##..#\n\nTile 2039:\n.#....####\n.##..#....\n.#.......#\n#........#\n#.......#.\n.#..#.....\n#.##......\n##....#..#\n.........#\n#.#......#\n\nTile 2969:\n...#####..\n..#.#...##\n##.....#..\n##.....###\n#...#..###\n#..#....##\n#..##...##\n.........#\n#...##...#\n.#......##\n\nTile 2153:\n.##..###..\n#.#..#..##\n.#####....\n#.#..#.###\n#.....#.##\n####..#.#.\n..........\n.#......#.\n...##...#.\n.#....####\n\nTile 2837:\n..###.....\n###.#.###.\n.#....#...\n##.....###\n##.##..###\n..#..##.##\n.#....##..\n#..##.##..\n#..#......\n#..##...#.\n\nTile 1619:\n##..###.##\n##....####\n.#..##.#..\n##.#...#..\n#..##.##..\n...#.#.#.#\n.....#.##.\n..##..#..#\n#..#..#..#\n......#.#.\n\nTile 3943:\n.#.##.#.#.\n.......#.#\n.........#\n...#..#..#\n...#....##\n#.#.##....\n##.......#\n.#..#.##.#\n...##.#..#\n#.##....#.\n\nTile 3389:\n#...#.##..\n#.##..#...\n#.#.#.....\n##...#...#\n##.....#..\n.#..###..#\n..###.....\n#.##..#.##\n####....##\n##.#.#####\n\nTile 3631:\n##.###.###\n#...#.....\n..#.......\n#....#.###\n#.........\n#.#.......\n....##...#\n........#.\n#....#....\n.....#.#..\n\nTile 2081:\n##..##.#..\n.##......#\n........##\n#.......##\n......##.#\n#....#....\n.#.#...##.\n....##..#.\n#.#..#####\n...#####..\n\nTile 1579:\n##........\n.....#...#\n#......#..\n#..#.#...#\n...#..#...\n#.##....##\n...#......\n.#...#..#.\n..#....#.#\n.##...#...\n\nTile 3019:\n.##..####.\n...#....##\n...##.#.#.\n#....#....\n.........#\n##..#..#.#\n...#.#...#\n.#.##.#.##\n##..#.....\n#..#..###.\n\nTile 2089:\n##.##.#...\n..#.##...#\n##...#....\n#........#\n#..#.....#\n..######.#\n.......#..\n...#..##..\n#.#....#..\n...#.#####\n\nTile 2297:\n#.#.###...\n#.##......\n#..#..#...\n......#..#\n#....#...#\n###.#..##.\n#....##.##\n.......#.#\n.........#\n.###.#.#..\n\nTile 1373:\n#..#.####.\n........#.\n....#....#\n.##..#...#\n.#.....#.#\n#.....#...\n#..#..#..#\n.##...##.#\n##.......#\n.##..#.#..\n\nTile 1259:\n...#..##.#\n....#.#..#\n#..#.##.##\n##..##....\n#..#.#..##\n#.#...#...\n..#......#\n...###.#.#\n..........\n.###..##..\n\nTile 2411:\n.###..#.#.\n.#..#..#..\n#.....#..#\n.#.....#..\n##..#...#.\n.#........\n#...##....\n#.#..##...\n.....#.#.#\n....#.##..\n\nTile 3359:\n.##..##.##\n..#.#..#.#\n#.......#.\n.#..###..#\n.#.....#..\n#.........\n...#.....#\n.##....#..\n.........#\n.#.##..#..\n\nTile 2437:\n.#.....#..\n#.#.......\n....##.#..\n##.###.##.\n##.#....#.\n#...#....#\n##..##..##\n...#..#..#\n....##.#.#\n.##.#.#...\n\nTile 1367:\n....#####.\n..#.#....#\n##......#.\n..##...##.\n..##..##.#\n..##.##..#\n#.#......#\n##...#...#\n.....#.#..\n##.###.###\n\nTile 3533:\n##..####..\n##..#....#\n...#.....#\n#.##..####\n###..##...\n....###..#\n..#.....##\n.##.#..#..\n....#.##..\n##.#.##.##\n\nTile 1451:\n.####.#...\n..##.#.#..\n...#.#....\n.........#\n....#...##\n##...##...\n..#...#...\n#...#.####\n...#.#.###\n#######...\n\nTile 3457:\n#.##.###.#\n#..#.#....\n###.#....#\n.#....#.##\n.......##.\n#...####.#\n#.#####..#\n#.#..#..#.\n#.#.......\n.#.##.....\n\nTile 2657:\n..#####..#\n......###.\n#.....#..#\n.#..###..#\n...#.##...\n#.....#..#\n#....#####\n....#..#..\n#.#.###..#\n.#..##.#..\n\nTile 2347:\n#.##.#.###\n#...#....#\n..........\n#.#.#.....\n#....#....\n#..#...###\n#.##...#..\n#.....#..#\n#.#.###.#.\n#...###.##\n\nTile 3923:\n#.####...#\n###...#.##\n......#..#\n..#..#..##\n#....#.#.#\n.........#\n.....#.#.#\n#..####..#\n....##.#..\n#..#...#..\n\nTile 2593:\n####...#..\n#...####.#\n#......##.\n..#..#....\n#..#.....#\n...#......\n....#.....\n#.#...##.#\n.......#.#\n#.#####.#.\n\nTile 1103:\n..##...#.#\n..#.....#.\n#....#...#\n...##....#\n#.#.....##\n.#.#.#.#..\n#....#####\n.#.#.#####\n.........#\n.##...#.#.\n\nTile 2671:\n.##.##.#.#\n...#.#....\n##....#...\n#......#..\n.#....#.##\n........##\n..#...###.\n###...#...\n....#.#..#\n.#######.#\n\nTile 3907:\n###....#..\n..##.....#\n..........\n##...#..##\n##..#..##.\n##..##..#.\n#.#.....##\n..###..#.#\n#..#..#..#\n#.#.......\n\nTile 1327:\n.#..#..#.#\n.###.###..\n..#..#....\n.#...#.#..\n#.##.....#\n#..#.#..#.\n###...#...\n##..#..#.#\n......#...\n#.#...###.\n\nTile 1163:\n..#.#...#.\n####.#.#..\n.##.....##\n#...#.....\n.....####.\n#...#..###\n...#.##.#.\n##..#..#..\n.....#.#.#\n.###...#.#\n\nTile 2683:\n.......#..\n.#.#.##..#\n##..#...##\n...#......\n##.##...#.\n...#.#.###\n.#.##.....\n#..#....#.\n.###..#...\n.#.#.....#\n\nTile 3881:\n#.#.#..##.\n##.#...###\n##......##\n#.........\n#..#......\n...#.#...#\n.#..##....\n.....##.#.\n##...#....\n###.....#.\n\nTile 2711:\n#...#.#.##\n#..##.....\n...#......\n#.#.#....#\n#...#.#...\n...#......\n.#.#......\n..#....#.#\n#.##..#...\n#.#.#.....\n\nTile 3491:\n.###..#.##\n.....#....\n.##..#..##\n##.##..#.#\n.###....##\n..##..#..#\n..#......#\n..#..#...#\n#...#.#..#\n.......##.\n\nTile 2339:\n###.#####.\n.#....#...\n##.#.....#\n#.........\n#.........\n..##..##.#\n.###......\n#...##....\n##........\n#.....#..#\n\nTile 1543:\n..##...#..\n.....#..##\n....##....\n.........#\n.#..#.#..#\n..........\n.........#\n#.#.#.....\n##.#.#....\n#.#.###..#\n\nTile 2371:\n#..#.#####\n##.#..###.\n#.#...##..\n#...###.##\n#...#..#.#\n##.....###\n.#.......#\n.....#.#..\n..#.#.####\n.###..##..\n\nTile 2971:\n..###.#...\n#.........\n##.#...###\n....###...\n###......#\n..###....#\n##.#.....#\n.#.....#..\n#.....####\n..##.##.#.\n\nTile 2203:\n#.###.#.##\n.#...##.#.\n#.#.....#.\n..#.#....#\n##..#....#\n##..#.....\n#..#..#...\n##........\n..#..#.#..\n##....#..#\n\nTile 2113:\n###...##.#\n......#...\n.....##.#.\n....####.#\n##..#..#..\n#...#...##\n.......#.#\n......#..#\n#.##.#..##\n....##.#..\n\nTile 1321:\n.#..#..#..\n##...#...#\n..........\n.####..#.#\n##.#.#.#.#\n#..#.#....\n#..#.....#\n.#.......#\n....###.#.\n##.#.##.##\n\nTile 1667:\n.#####...#\n##....#..#\n#..#.#....\n..##..#...\n#..##...##\n...#......\n..#..#...#\n.....#...#\n#..#...#.#\n##..#.##..\n\nTile 3001:\n.#.#######\n...#.#...#\n..##...#.#\n#.........\n....#.....\n#.....##.#\n.....####.\n#.........\n...#.##.##\n##.##..###\n\nTile 1789:\n..###.#..#\n...##...#.\n........#.\n####...#.#\n#..#..#...\n##.##..##.\n....#.....\n#.#.#.....\n#.#..#...#\n######.#..\n\nTile 3677:\n.#...#.###\n#..##...##\n#..#...#.#\n##........\n..#....###\n..........\n##..#.##.#\n.#........\n......##..\n.##.##...#\n\nTile 2693:\n#.#.###.#.\n#.#..#..#.\n.#....#...\n#..#...#.#\n.#.##..##.\n.##......#\n...#.....#\n##...#.###\n.#.#.....#\n########..\n\nTile 2141:\n#####.....\n#.........\n#...#....#\n....#.....\n.......#..\n##..#.#..#\n#....#..#.\n..#....#..\n.....##.#.\n##..#.#.#.\n\nTile 3847:\n#...######\n#..#.##..#\n..#...##.#\n##..#.#..#\n##..#..#.#\n##.##....#\n#........#\n#....#.#..\n#.........\n#......#..\n\nTile 2333:\n#.#..##.#.\n####.....#\n###..#...#\n.........#\n...##.#..#\n###.......\n..##...#.#\n...###...#\n.###.#...#\n##..#.##..\n\nTile 2129:\n#..###.###\n....#....#\n#.#.#..#.#\n....#....#\n#...#.#..#\n..##.##...\n#.##....#.\n#...#.#...\n.#..##...#\n...###.##.\n\nTile 1283:\n.#..#.###.\n###.#.##.#\n#..#..#.#.\n.....#...#\n.#.#.#....\n#...#..#.#\n.#.#..#.##\n.#..##..#.\n#....##.#.\n.#..#...#.\n\nTile 2851:\n.##.#.....\n###......#\n.#........\n....#.#..#\n.#..#..#..\n.##....#..\n.##...#.##\n#.###.##.#\n##........\n.#.#.#.#.#\n\nTile 2311:\n#..##....#\n.#......#.\n....#...##\n....#...#.\n.#...#...#\n#...#....#\n.....#.#.#\n.....##..#\n##..##.###\n##..###.#.\n\nTile 3217:\n#.##....##\n#.......#.\n#.#....#.#\n..##.###..\n....##...#\n#.........\n...#.#...#\n..##....##\n..#......#\n##.###..##\n\nTile 2833:\n####..#..#\n#...##.#.#\n........##\n..##..#...\n.......#..\n......#...\n###..#..#.\n.##..#...#\n##.#....#.\n.####.....\n\nTile 3593:\n#..#####..\n.##.#....#\n...#..#..#\n##.#...##.\n#######...\n...#..#...\n#.##..#.#.\n#........#\n#...##..##\n........##\n\nTile 3299:\n...#.#..#.\n#.#......#\n##......##\n.#..#..#..\n#.#####...\n#...#....#\n#.#.......\n..#....#.#\n.#........\n#.#.#.##..\n\nTile 2719:\n...#..#.#.\n#..#.###..\n......#.##\n....#.#..#\n#.#......#\n....#.....\n##..#.#...\n...##.....\n###.#....#\n..####..##\n\nTile 2161:\n..#.##..##\n#........#\n...#.#...#\n...###....\n......#..#\n..##.##.#.\n.#....#.##\n#...#####.\n#....#...#\n.#....#...\n\nTile 3643:\n...#...##.\n##......##\n....#.###.\n.#.#..####\n..#.#...##\n.##.#.#.#.\n#.#..#..#.\n#..#.#..#.\n.#........\n.#.###....\n\nTile 3767:\n.##.#....#\n#...#...##\n.#...##..#\n.#.#......\n..#..#..##\n#..#.#.##.\n#.....#.##\n....##...#\n.....#.##.\n..#..###..\n\nTile 2377:\n.#####.#.#\n..#.....##\n#...#...#.\n##....##..\n....#..#..\n#.##..#..#\n.#...#.##.\n...##...#.\n#....#....\n..#.#..###\n\nTile 2441:\n....#.###.\n.#..#....#\n.#.###....\n#...#.....\n#.#.##....\n....##....\n....##...#\n...#..##..\n#...###.##\n.##.#.#.#.\n\nTile 2273:\n...#..#.#.\n#..#...###\n..#....#..\n...###.#..\n.........#\n..##.#..##\n###.#....#\n#..#.....#\n....#...#.\n.##..#####\n\nTile 1231:\n....#####.\n#.....#.#.\n..#....#.#\n.###..##.#\n#..#....##\n#..#.#.#..\n..#.###...\n##........\n..#.....##\n##.##..#.#\n\nTile 2879:\n#####.###.\n#..#..#..#\n...#..#..#\n#.........\n.#.#.#...#\n...#..#..#\n#.#..#.###\n#.....####\n.......#.#\n..##.#####\n\nTile 2473:\n.##.###..#\n....##.#.#\n#..#..#..#\n..#.#.#...\n#..##.....\n.##....#..\n....##..##\n...#.....#\n....#.....\n.#####.#..\n\nTile 3329:\n#.#..###..\n......###.\n.###..##..\n...#.##...\n#..#.#.###\n#.###..##.\n##..##...#\n..#####..#\n.#...#....\n#.##.#..#.\n\nTile 1489:\n....#....#\n#.##.....#\n..#......#\n..#...#..#\n.#....#..#\n#..##...#.\n..####.##.\n.#..##..##\n..#.....#.\n##.#.##..#\n\nTile 3259:\n..####.###\n##.##..#.#\n.#..#..###\n#.#.......\n.....#.#..\n##...#.#..\n.....#...#\n.#....#...\n..#.#....#\n######....\n\nTile 1123:\n....#.#.#.\n...##.....\n...##....#\n#.##....##\n..#...#..#\n.#..#.....\n.#......##\n.........#\n.....#...#\n.##.###...\n\nTile 1381:\n.###..#.##\n#..##..#..\n#.....#..#\n#..#..#..#\n#....#.#.#\n.......#.#\n#...#.#..#\n##..###..#\n..#..##...\n..##.#..#.\n\nTile 2903:\n#.###.###.\n#..###..#.\n##.......#\n.#....#...\n#..#..##.#\n...#...#.#\n#.#...##.#\n......#..#\n##.#..#..#\n##.#..##.#\n\nTile 1049:\n#....#.###\n####.....#\n#.##....#.\n.#....##..\n.##..#..##\n#.#.#..#.#\n.##...#..#\n...#..#.##\n.....#..##\n..#.#.###.\n\nTile 3137:\n...#.#.#.#\n#.#....#..\n..###...#.\n..#..##..#\n.#.#.##.#.\n#.#..##..#\n#.....#...\n##...##.##\n#.#...#...\n.##.#.....\n\nTile 2131:\n.#......##\n...#...##.\n.#.#.#.#.#\n..........\n...#....#.\n#.#.#..#.#\n..#.#....#\n....##....\n....##..#.\n##.##..#..\n\nTile 3733:\n.#.#....##\n.#..#....#\n..###.#..#\n.....#...#\n...#.....#\n###..#....\n#...#.####\n......#...\n..#..#....\n.#####.#..\n\nTile 1973:\n.#.#.##...\n#.....#..#\n#......#..\n...#...#.#\n..#..#...#\n####.#....\n....#..#.#\n.#.....#.#\n....#..#.#\n..#..#.#..\n\nTile 3889:\n#.##.#...#\n#....##..#\n.###..#.##\n..#...###.\n#....##...\n#.##......\n#.#..#..#.\n...#.#...#\n........##\n##.#..#.#.\n\nTile 1129:\n#...######\n#...#.##.#\n###.....#.\n#.#..#..#.\n.#....#...\n..#...#..#\n#....#.###\n......#.#.\n#.#..##.##\n.###..#..#\n\nTile 1549:\n.#..##.#..\n#.#....###\n...#..#...\n##....#...\n..##...#.#\n#.#....###\n..#.##.##.\n.....#...#\n#.##.....#\n#..#.##...\n\nTile 2213:\n#...#.#.##\n#........#\n...##...##\n.#..##.#.#\n#..##....#\n...##...##\n##........\n....#....#\n...#.#.#.#\n..#.###..#\n\nTile 1597:\n..###..#..\n#......#..\n.......#.#\n#.#....###\n#.###..#.#\n##.#.##...\n#.##.#..##\n.#.#..##..\n.##..#...#\n##...#####\n\nTile 1777:\n#..#....#.\n.........#\n..#.....#.\n..#......#\n.##....#..\n#...#...#.\n.#..#.....\n#.....#..#\n.#..##...#\n#.#...#...\n\nTile 2503:\n#..###.#..\n.#..##.#..\n....##....\n..#..#....\n#....#.#..\n#.#....#.#\n...#.#....\n..##.#....\n#.#.#....#\n#.######..\n\nTile 3499:\n.####...##\n.#.##..#..\n#........#\n..#......#\n##..#...#.\n#...##....\n#......#..\n.#.#....##\n...#..#...\n.##.#...#.\n\nTile 1811:\n#.###...##\n..##...#..\n..#.#..###\n##.#....#.\n.#...#....\n##.......#\n#....#...#\n...##.##..\n...#.....#\n.####..#..\n\nTile 3793:\n###.####..\n##...###.#\n...#.###..\n#....#....\n.....#....\n...#.....#\n###.####..\n#.##.##.##\n......#...\n#.#.###...\n\nTile 2341:\n.##..#.###\n.#........\n..####..#.\n.#..####.#\n#....#...#\n......##.#\n#.....#...\n..........\n#..###....\n####.#####\n\nTile 3613:\n..#.#.#.#.\n#....###..\n#......#..\n#.#...#.##\n#..#.....#\n##.#.#.#..\n...####..#\n##...###.#\n#.#.#....#\n#..####...\n\nTile 3701:\n..##.####.\n#.##...###\n.###.#....\n#..#.....#\n##........\n###..#.###\n..#...#.#.\n.##...#..#\n##.......#\n###.#...##\n\nTile 1483:\n#####..##.\n....#..#.#\n...#####.#\n#.##...#..\n........#.\n........##\n##..##.###\n.###....##\n...###..#.\n...#.#..#.\n\nTile 3571:\n#.#.##.##.\n#......##.\n#...#.#...\n.#.#....#.\n#.#....#..\n#.#...#...\n##.....#.#\n##.#.#...#\n#....#...#\n#.#..#..##\n\nTile 2521:\n##.##..#.#\n......#..#\n.#.#.#.##.\n#........#\n.#.##....#\n.#....#.#.\n##......#.\n#....#....\n.#..#...#.\n.#..#..###\n\nTile 3413:\n.##.##..#.\n#...#..#..\n##....#..#\n..........\n#..#...#..\n##..#....#\n....#.#...\n#.....#...\n......#.##\n..##.##.#.\n\nTile 1933:\n#..#....##\n#...#..###\n.#......##\n......#..#\n..........\n##.##..###\n.......###\n...#...###\n.#....#..#\n#.#..#.#.#\n\nTile 1021:\n.#..##.#.#\n##....#...\n.#........\n.#.#....##\n.#......##\n##........\n.....#..#.\n#....#.#.#\n#.........\n..#.#.##.#\n\nTile 3323:\n...###.#..\n.#..####..\n....#.....\n#.....##.#\n###......#\n..########\n.#....##.#\n....##.##.\n#..##....#\n#.##.#..#.\n\nTile 1607:\n....####..\n##.#...#.#\n.......#.#\n#.........\n..#..####.\n..#..#.##.\n.###.#...#\n##...#....\n#.######..\n##.#.#.###\n\nTile 1481:\n.###...#..\n.#......##\n.....#...#\n...#...##.\n#.###.##..\n#......###\n#.........\n###...###.\n.#....##..\n#....###.#\n\nTile 1879:\n###.##....\n#.#.....##\n#.#..#.#.#\n.#...#..##\n......####\n#.###.....\n......###.\n#..#.#..##\n..#......#\n.#..#.....\n\nTile 2927:\n###..##.#.\n#..#....#.\n##..#.....\n#.#...####\n#.........\n..###...##\n#.####...#\n#.##.##..#\n...#......\n#....#.##.\n\nTile 1867:\n..#..####.\n##.##..#.#\n.##......#\n###..#....\n..#......#\n#..##..#.#\n#.........\n...#..#..#\n#......#..\n.#....#.#.\n\nTile 2647:\n#####.##.#\n...#...#..\n#.......##\n...#..#..#\n..#.###...\n...##.....\n..#......#\n.##.......\n#...#.....\n##...##.#.\n\nTile 2207:\n#.#####.#.\n#..#.#..##\n...##....#\n..#..#.#.#\n#...###..#\n.##.#...##\n#..##..###\n#.........\n###.#..#.#\n.#....##.#\n\nTile 1223:\n###.....#.\n#.....#.##\n##.##.#...\n#...##...#\n#....#....\n..#.##....\n##....##..\n..#..#....\n.#.##..#..\n###.#.####\n\nTile 1931:\n##.#...###\n#...##....\n#..#....#.\n..##..#...\n#...#.....\n.........#\n###.##....\n...##.#..#\n.#.#.....#\n..#..##.##\n\nTile 3917:\n.##.#..#..\n.......##.\n#.##....##\n...#....##\n###....#.#\n.##.#...##\n###.......\n##.....#..\n....###.##\n....#...#.\n\nTile 1663:\n#.#.....##\n.#.##.#..#\n....#...#.\n#...##...#\n#..#......\n.#..#.#..#\n..#..#..##\n...#......\n#...##....\n.##.######\n\nTile 3373:\n#..###.###\n##...#.#..\n#..#..#..#\n.#....##.#\n..###..##.\n...#.#...#\n#.....#..#\n##..#.....\n.#..#.#...\n.#...###.#\n\nTile 1319:\n.#.#.#.#.#\n.....#..##\n..#.#.#.#.\n.#.##...#.\n..##......\n...#......\n.#........\n#..#.....#\n#..##....#\n.#.##.#..#\n\nTile 2687:\n#...###.#.\n##.#...##.\n#...#...##\n#..##....#\n......#.#.\n.###.#.#..\n##...#..##\n......#..#\n..........\n#.....##.#\n\nTile 2003:\n.######...\n.##...###.\n....#.....\n#.###.#.#.\n......#..#\n..##.#.#.#\n#.##..#.#.\n####.#....\n#...#.#.##\n......##.#\n\nTile 1453:\n###.#.####\n...###..#.\n.#..#..###\n..#......#\n#.#..#..##\n..#..#.#..\n#.#...#.#.\n..##..#.#.\n#..###....\n..#..#..##\n\nTile 1871:\n..#..#####\n##..#....#\n##.......#\n#..#..#..#\n#.....#.#.\n#..###....\n..........\n.#........\n.#.##.##.#\n#.#..#.###\n\nTile 3709:\n.##.#.##..\n.#..##...#\n.##.......\n..##.#....\n.........#\n....#.....\n###.#.##..\n.#####....\n#####.#...\n..#..#####\n"
  )
}
