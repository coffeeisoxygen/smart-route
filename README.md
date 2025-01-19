# Smart Route

## Project Overview
This is a project for the "Algorithm and Data Structure" course at Universitas Nusaputra. The project is developed by a student of **Semester 1, Class TI24B** to demonstrate the practical application of graph algorithms and data structures such as stacks and sorting in real-world scenarios. The project combines computational efficiency with user-centric design to solve a meaningful problem.

---

## Project Purpose
Smart Route is a **Journey Planner and Pathfinder** application that leverages graph algorithms to calculate the shortest route between cities or locations. The main objective of this project is to provide:
- **Optimal Travel Planning**: Suggests routes that minimize fuel consumption or travel time.
- **Cost Estimation**: Provides a detailed estimation of fuel cost based on vehicle type and fuel prices.
- **Customizable Journeys**: Allows users to input stopovers or avoid specific routes to personalize their travel plan.

This application not only explores fundamental concepts like graphs and algorithms but also integrates them into a practical tool.

---

## Features
### 1. User Input
- Select the type of vehicle: **Car** or **Motorcycle**.
- Enter vehicle details:
  - Engine capacity (CC).
  - Fuel type (**Pertalite**, **Pertamax**, or **Solar**).
  - Current fuel price (dynamic input).
- Specify the trip:
  - Starting city (origin).
  - Destination city.
  - Optional stopovers (comma-separated).

### 2. Route Optimization
- Uses **Dijkstra's Algorithm** to calculate the shortest path based on:
  - Travel time.
  - Fuel consumption.
- Recommends alternative routes to improve efficiency.

### 3. Output
- **Fuel Cost Estimation**: Predicts the total fuel cost for the journey.
- **Travel Time Estimation**: Calculates the approximate time required based on route and speed.
- Displays the **optimized route** on the console with detailed metrics.

---

## Core Technologies
1. **Java**: The primary programming language used for developing the application.
2. **Graph Algorithms**:
   - Dijkstra's Algorithm for pathfinding.
   - Optimizations for fuel and time calculations.
3. **Logback**: For logging application processes and debugging.
4. **Object-Oriented Programming (OOP)**: Encapsulated logic in classes such as:
   - `Vehicle` (base class), `Car`, and `Cycle` (derived classes).
   - `BBM` for managing fuel types, prices, and mileage.
5. **Dynamic Data Structures**:
   - **Stack**: Used internally for handling route backtracking.
   - **Sorting Algorithms**: For presenting alternative routes efficiently.

---

## How It Works
1. **User Interaction**: Input vehicle and trip details via a console-based interface.
2. **Graph Construction**: The application creates a graph where:
   - **Nodes** represent cities.
   - **Edges** represent roads with attributes like distance and time.
3. **Optimization**: Runs the graph algorithms to compute the best route based on user preferences.
4. **Output Display**: Presents the results with recommendations to improve the journey.

---

## Installation & Usage
### Prerequisites
- **JDK 17+** installed.
- A code editor or IDE (e.g., IntelliJ IDEA, Eclipse).

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/smart-route.git
   ```
2. Open the project in your preferred IDE.
3. Configure the log directory if needed (default: `./logs`).
4. Run the `Main` class to start the application.

---

## Example
### Input:
```text
Select Vehicle: Car
Enter Engine Capacity (CC): 1500
Enter Fuel Type: Pertamax
Enter Fuel Price: 13500
Starting City: 1
Destination City: 5
Stopovers: 3,4
```

### Output:
```text
Optimal Route: 1 -> 3 -> 4 -> 5
Estimated Travel Time: 2 hours 45 minutes
Estimated Fuel Cost: Rp 110,250
Recommendation: Take Route 1 -> 4 -> 5 for shorter travel time.
```

---

## Contribution
This project was developed by:
- **Your Name**
- **Semester 1, Class TI24B**

Special thanks to Universitas Nusaputra for providing the opportunity to explore and apply data structures and algorithms in a practical project.

---

## Future Improvements
- **GUI Implementation**: Add a graphical user interface for better user interaction.
- **Integration with Maps API**: Enhance the application with real-world data.
- **Advanced Algorithms**: Include A* or other heuristic-based algorithms for route optimization.
- **Mobile App Support**: Expand functionality to mobile platforms.

---

## License
This project is licensed under the MIT License. Feel free to use, modify, and distribute this code with proper attribution.

---

## Contact
For any inquiries, suggestions, or collaboration, contact:
- Email: your.email@example.com
- GitHub: [yourusername](https://github.com/yourusername)

