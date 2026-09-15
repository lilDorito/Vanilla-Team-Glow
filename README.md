# Vanilla Team Glow

<div align="center">

**See your teammates through walls - in their team's color.**
  
[![License: MIT](https://img.shields.io/badge/License-GPL%203.0-orange.svg)](LICENSE)
[![Minecraft](https://img.shields.io/badge/Minecraft-1.20.1-green.svg)](https://minecraft.net)
[![Forge](https://img.shields.io/badge/Forge-47.2.0-blue.svg)](https://files.minecraftforge.net/)

Ever lost your squad in a chaotic UHC, SMP, team PvP match, or even a MilSim? Vanilla Team Glow makes every player on your vanilla scoreboard team glow with an outline in their team's exact color, visible right through terrain.

Built for **Forge**, because apparently nobody else got around to it.

</div>

## Features

- **Zero setup** - works instantly with vanilla `/team` commands, no config needed
- **Team-color accurate** - outline color always matches your scoreboard team
- **See through walls** - glow renders even when teammates are out of line of sight
- **Lightweight** - client-side only, no server mod required

## Requirements

- Minecraft **1.20.1**
- Forge **47.4.10+**

## Installation

1. Grab the latest `.jar` from [Releases](../../releases) (or Modrinth / CurseForge)
2. Drop it in your `.minecraft/mods` folder
3. Launch Forge 1.20.1 and go

> Client-side mod - everyone who wants to see the glow needs it installed. It won't glow for players without the jar.

## Usage

Set up teams like normal:

```
/team add red
/team modify red color red
/team join red PlayerName
```

That's it. Anyone on your team now glows red (or whatever color you set) for you, automatically.

## Building from source

```bash
git clone https://github.com/lilDorito/Vanilla-Team-Glow.git
cd Vanilla-Team-Glow
./gradlew build
```

Built jar lands in `build/libs/`.

## License

MIT - do whatever you want with it. See [LICENSE](LICENSE).

---

*If this saved your team from friendly-fire chaos, drop a ⭐ on the repo pls.*
