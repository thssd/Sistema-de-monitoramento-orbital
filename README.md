# 🛰️ Sistema de Monitoramento Ambiental via Satélite

## 📌 About

The system simulates a satellite monitoring network capable of detecting environmental threats in Brazilian areas such as the Amazon Rainforest and Atlantic Forest. It processes orbital readings to identify flood risks and deforestation, manages environmental occurrences, and issues alerts to the appropriate authorities.

---

## ✨ Features

- 🛰️ **Satellite management** — register and view active satellites with altitude data
- 🗺️ **Area monitoring** — track areas by name, state, biome, and size in hectares
- 📡 **Orbital readings** — analyze water level, vegetation index, and temperature per area
- 🌊 **Flood risk detection** — classifies risk as low, medium, or high based on water level thresholds
- 🌳 **Deforestation detection** — identifies vegetation loss via vegetation index analysis
- ⚠️ **Occurrence management** — register, list, and resolve environmental incidents with urgency classification
- 🔔 **Alert system** — create and dispatch alerts with severity levels and location data
- 🖥️ **Interactive terminal menu** — structured navigation via numbered options using `Scanner`

---

## 🗂️ Project Structure

```
src/
├── entities/
│   ├── Satelite.java        # Satellite entity (name, altitude, active status)
│   ├── Area.java            # Monitored area (name, state, biome, size)
│   ├── LeituraOrbital.java  # Orbital reading with flood/deforestation analysis
│   ├── Ocorrencia.java      # Environmental occurrence with urgency logic
│   └── Alerta.java          # Alert entity with dispatch behavior
└── view/
    └── Terminal.java        # Main class — interactive menu via terminal
```

---

## 🧠 Object-Oriented Design

Each domain concept is modeled as an independent class with encapsulated state and relevant behavior:

| Class | Responsibility |
|---|---|
| `Satelite` | Represents an orbital satellite with altitude and active status |
| `Area` | Represents a monitored geographic region |
| `LeituraOrbital` | Holds sensor data and encapsulates risk analysis methods |
| `Ocorrencia` | Models an environmental incident with urgency classification |
| `Alerta` | Represents a dispatched alert with severity and location |

---

## 🚀 How to Run

**Prerequisites:** Java 17+ and any Java IDE (IntelliJ IDEA recommended) or the terminal.

**Clone the repository:**
```bash
git clone https://github.com/thssd/Sistema-de-monitoramento-orbital.git
```

**Run via terminal:**
```bash
cd src
javac entities/*.java view/Terminal.java
java view.Terminal
```

**Or simply open the project in IntelliJ IDEA and run `Terminal.java`.**

---

## 🖥️ Menu Options

```
====== MENU ======
[1] Ver satélites
[2] Ver áreas monitoradas
[3] Ver leituras orbitais
[4] Ver ocorrências
[5] Ver alertas
[6] Resolver uma ocorrência
[7] Enviar um alerta
[0] Sair
==================
```

---

## 🌍 Monitored Areas (Pre-configured)

| Satellite | Area | Biome | State |
|---|---|---|---|
| SentinelBR-1 | Floresta Amazônica | Amazônia | AM |
| SentinelBR-2 | Serra do Mar | Mata Atlântica | SP |

---

## 🛠️ Tech Stack

- **Language:** Java
- **Paradigm:** Object-Oriented Programming (OOP)
- **I/O:** Terminal interface via `java.util.Scanner`
- **IDE:** IntelliJ IDEA

---

## 📚 Academic Context

Developed as part of the **Global Solution** challenge at [FIAP](https://www.fiap.com.br/) — Faculdade de Informática e Administração Paulista — for the Systems Analysis and Development program (2026).
