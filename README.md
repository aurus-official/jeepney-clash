
# 🚍 Jeepney Clash – Real-Time Multiplayer Arena Game

Jeepney Clash is a top-down 2D real-time multiplayer arena game inspired by Philippine jeepneys, built with Java Spring Boot (backend) and React + Phaser (frontend). Players compete in fast-paced matches where movement, timing, attacks, and strategic evades determine the winner.





## 🏆 Features
Real-time multiplayer using WebSockets

Top-down arena gameplay with obstacles and power-ups

Player mechanics: move, attack, evade/dodge (with cooldowns)

Skill-based evade system inspired by Dark Souls, requiring precise timing

Secure authentication using Spring Security + BCrypt

Matchmaking and leaderboards for competitive play

Scalable backend design with room for Redis caching for high-load scenarios
## ⚙️ Tech Stack
Backend: Java, Spring Boot, Spring Security, Spring Data JPA, WebSocket

Frontend: React, Phaser (2D game rendering)

Database: H2 (development) / PostgreSQL (production-ready)

Optional Caching: Redis for session & leaderboard scaling
## 🎮 Gameplay Overview


Login/Register – Secure authentication with Spring Security

Matchmaking – Players enter queue for arena matches

Gameplay – Move, attack, and time your evade to outplay opponents

Scoring – Points for hits, eliminations, and power-ups

Win Conditions – Last player standing or highest score within time limit
## 📁 Repository Structure
jeepney-clash/                                           
├─ backend/                      
├─ frontend/                
├─ README.md    
└─ .gitignore
## 🔮 Future Improvements
Integrate Redis caching for session management and leaderboard scaling

Add directional evade/roll mechanics

Support larger arenas and more concurrent players

Add power-ups with unique effects