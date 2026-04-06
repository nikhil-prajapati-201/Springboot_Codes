package com.finance.dashboard.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.dashboard.dto.ApiResponse;
import com.finance.dashboard.service.DashboardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/dashboard")
@RequiredArgsConstructor
public class DashboardController {

    private final DashboardService dashboardService;

    @GetMapping("/summary")
    public ResponseEntity<?> summary() {
        return ResponseEntity.ok(ApiResponse.ok("Summary fetched", dashboardService.getSummary()));
    }

    @GetMapping("/category-breakdown")
    @PreAuthorize("hasAnyRole('ADMIN','ANALYST')")
    public ResponseEntity<?> categoryBreakdown() {
        return ResponseEntity.ok(ApiResponse.ok("Category breakdown", dashboardService.getCategoryBreakdown()));
    }

    @GetMapping("/monthly-trends")
    @PreAuthorize("hasAnyRole('ADMIN','ANALYST')")
    public ResponseEntity<?> monthlyTrends() {
        return ResponseEntity.ok(ApiResponse.ok("Monthly trends", dashboardService.getMonthlyTrends()));
    }

    @GetMapping("/recent-activity")
    public ResponseEntity<?> recentActivity() {
        return ResponseEntity.ok(ApiResponse.ok("Recent activity", dashboardService.getRecentActivity()));
    }

    @GetMapping("/weekly-summary")
    @PreAuthorize("hasAnyRole('ADMIN','ANALYST')")
    public ResponseEntity<?> weeklySummary() {
        return ResponseEntity.ok(ApiResponse.ok("Weekly summary", dashboardService.getWeeklySummary()));
    }
}